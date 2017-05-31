grammar DondeInviertoSinCodigoJava;
@parser::header{
import ar.edu.utn.frba.dds.dondeinvierto.ast.*;
import ar.edu.utn.frba.dds.dondeinvierto.Operable;
import java.util.ArrayList;
import java.util.List;
}
@parser::members {
  List<Operable> lista = new ArrayList<Operable>();
  public DondeInviertoSinCodigoJavaParser(TokenStream input, List<Operable> listaOperable) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
		lista=listaOperable;
  }
  
  public double obtenerValor(String nombre, List<Operable> lOperables) {
	return lOperables.stream().filter(operable -> nombre.equalsIgnoreCase(operable.getNombre())).findFirst().get().operar(lOperables);
  }
}


metodologia
	: expresion relop expresion
	;
	
identificador returns [Object valor]
	: expresion {$valor=(double)$expresion.valor; System.out.println($valor);}
	;

expresion returns [Object valor]
   : t1=termino {$valor=(double)$t1.valor;}
   		(SUMA t2=termino {$valor=(double)$valor+(double)$t2.valor;})* # Suma
   | t1=termino {$valor=(double)$t1.valor;}
   		(RESTA t2=termino {$valor=(double)$valor-(double)$t2.valor;})* # Resta
   ;

termino returns [Object valor]
	: f1=factor {$valor=(double)$f1.valor;}
   		(MULT f2= factor {$valor=(double)$valor*(double)$f2.valor;})*
   	| f1=factor {$valor=(double)$f1.valor;}
   		(DIV f2= factor {$valor=(double)$valor / (double)$f2.valor;})*
   ;

factor returns [Object valor]
   : a1=atom {$valor=(double)$a1.valor;} (POTENCIA a2= atom {$valor=(double)$valor+(double)$a2.valor;})*
   ;

atom returns [Object valor]
   : cientifica {$valor=(double)$cientifica.valor;} #Cientif
   | NOMBRE_CUENTA {$valor = this.obtenerValor($NOMBRE_CUENTA.getText(), lista);} #NombreCuenta
//   | NOMBRE_CUENTA {$valor = (double) (new CuentaExpresion($NOMBRE_CUENTA.getText())).execute();} #NombreCuenta
//   {$valor=Double.parseDouble($NOMBRE_CUENTA.getText());} #NombreCuenta
   | NOMBRE_INDICADOR {$valor=obtenerValor($NOMBRE_INDICADOR.getText(), lista);} #NombreIdentificacion
   | LPAREN expresion RPAREN {$valor=(double)$expresion.valor;} #Parentesis
   ;

cientifica returns [Object valor]
   : n1=number {$valor=(double)$n1.valor;} (E n2= number {$valor=(double)$valor * Math.pow(10,(double)$n2.valor);})?
   ;

relop
   : EQ
   | GT
   | LT
   ;

number returns [Object valor]
	: NUMERO {$valor = Double.parseDouble($NUMERO.getText());}
//   : sig=RESTA? d1=DIGIT {$valor= Double.parseDouble(sig.getText()+d1.getText());}
//   		(d2=DIGIT {$valor= ((double)$valor * 10) + Double.parseDouble(d2.getText());})* 
//   		(POINT (d3=DIGIT {$valor = $valor + Double.parseDouble(d3.getText());})+)? 
//   		 #Numero
   ;
   
NOMBRE_INDICADOR: 'IN_'(LETTER|DIGITO)+
	;
	
NOMBRE_CUENTA: 'CU_'(LETTER|DIGITO)+
	;

LPAREN
   : '('
   ;


RPAREN
   : ')'
   ;


SUMA
   : '+'
   ;


RESTA
   : '-'
   ;


MULT
   : '*'
   ;


DIV
   : '/'
   ;


GT
   : '>'
   ;


LT
   : '<'
   ;


EQ
   : '='
   ;


POINT
   : '.'
   ;


E
   : 'e' | 'E'
   ;


POTENCIA
   : '^'
   ;


LETTER
   : [a-zA-Z_][a-zA-Z_]* 
   ;


NUMERO
   : RESTA? DIGITO+ (POINT DIGITO+)?
   ;
   
DIGITO
	: [0-9]
	;

WS
   : [ \r\n\t] + -> channel (HIDDEN)
   ;
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
	
identificador returns [ExpresionASA exp]
	: expresion {$exp= new Indicador($expresion.exp);}
	;

expresion returns [ExpresionASA exp]
   : t1=termino {$exp= $t1.exp;}
   		(SUMA t2=termino {$exp= new Suma($exp, $t2.exp);} | RESTA t3=termino {$exp= new Resta($exp, $t3.exp);})* 
   ;

termino returns [ExpresionASA exp]
	: f1=factor {$exp=$f1.exp;}
   		(MULT f2= factor {$exp=new Multiplicacion($exp, $f2.exp);} | DIV f3= factor {$exp=new Division($exp, $f3.exp);})*
   ;

factor returns [ExpresionASA exp]
   : a1=atom {$exp=$a1.exp;} (POTENCIA a2= atom {$exp=new Potencia($exp, $a2.exp);})*
   ;

atom returns [ExpresionASA exp]
   : cientifica {$exp=$cientifica.exp;} #Cientif
   | NOMBRE_CUENTA {$exp = new Constante(this.obtenerValor($NOMBRE_CUENTA.getText(), lista));} #NombreCuenta
   | NOMBRE_INDICADOR {$exp=new Constante(obtenerValor($NOMBRE_INDICADOR.getText(), lista));} #NombreIdentificacion
   | LPAREN expresion RPAREN {$exp=$expresion.exp;} #Parentesis
   ;

cientifica returns [ExpresionASA exp]
   : n1=number {$exp=$n1.exp;} (E n2= number {$exp=new NotacionCientifica($exp, $n2.exp);})?
   ;

relop
   : EQ
   | GT
   | LT
   ;

number returns [ExpresionASA exp]
	: NUMERO {$exp = new Constante($NUMERO.text);}
	//o getText
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
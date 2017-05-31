grammar DondeInvierto;
@parser::header{
import ar.edu.utn.frba.dds.dondeinvierto.ast.*;
}

identificador
	: expresion
	;

metodologia returns [NodoAST nodo]
	: expresion relop expresion
	;

expresion returns [NodoAST nodo]
   : t1=termino {$nodo = $t1.nodo;}
   		(SUMA t2=termino {$nodo = new Suma($nodo, $t2.nodo);}| RESTA t2=termino {$nodo = new Resta($nodo, $t2.nodo);})*
   ;

termino returns [NodoAST nodo]
	: f1=factor {$nodo = $f1.nodo;}
   		(MULT f2=factor {$nodo = new Multiplicacion($nodo, $f2.nodo);}| DIV f2=factor {$nodo = new Division($nodo, $f2.nodo);})*
   ;

factor returns [NodoAST nodo]
   : atom (POTENCIA atom)*
   ;

atom returns [NodoAST nodo]
   : cientifica #Cientif
   | NOMBRE_CUENTA #NombreCuenta
   | NOMBRE_IDENTIFICADOR #NombreIdentificador
   | LPAREN expresion RPAREN #Parentesis
   ;

cientifica returns [NodoAST nodo]
   : number (E number)?
   ;

relop returns [NodoAST nodo]
   : EQ
   | GT
   | LT
   ;

number
   : RESTA? DIGIT + (POINT DIGIT +)? #Numero 
   ;
   
NOMBRE_IDENTIFICADOR: 'ID_'LETTER*DIGIT* 
	;
	
NOMBRE_CUENTA: 'CU_'LETTER*DIGIT* 
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


DIGIT
   : ('0' .. '9')
   ;


WS
   : [ \r\n\t] + -> channel (HIDDEN)
   ;
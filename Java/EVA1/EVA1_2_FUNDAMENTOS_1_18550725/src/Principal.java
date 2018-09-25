/*
 * Identificar elementos del lenguaje en Java
 */

/**
 *
 * @author Carlos Rogelio Rivera Lujan 18550725
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // TIPO DE DATO - NOMBRE DE DE LA VARIABLE | CONSTANTE |IDENTIFICADOR
        int iEdad;//identificador válido
        int _iEdad;//inicia con _ identificador válido
        int iEdad25;//numero no al inicio, identificador válido
        int iedad;//sensible a las mayusculas y minúsculas
        int iEd$; //signo de pesos (Java lo acepta)
        int String; //no se recomienda , String es un tipo de dato de Java 
        int iValor=5 + 7;
        
        //-----------
        // EJEMPLOS ERRORES DE IDENTIFICADORES
        int 25edad;
        int tu edad;
        int iEdad;
        int algo-mas;//el - es un operador que representa una resta
        int int;
    }
    
}

class Algo{}

class Algo25{}

class _AlgoMas{}

class $Algomas{}

class algo mas{}

class algo-mas{}

class 25algomas{}

class algo{}

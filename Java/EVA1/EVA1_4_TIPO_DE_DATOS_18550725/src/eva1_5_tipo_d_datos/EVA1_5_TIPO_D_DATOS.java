/*
 * Ejemplo del manejo de entradas y salidas en lenguaje JAVA.
 */
package eva1_5_tipo_d_datos;

import java.util.Scanner;

/**
 *
 * @author Carlos Rogelio Rivera Lujan 18550725
 */
public class EVA1_5_TIPO_D_DATOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Introduce tu nombre ");
        String sNombre; //DECLARANDO
        Scanner sInput; //DECLARANDO
        //SCANNER ES UNA CLASE PARA USAR CLASES
        //SE HACE A TRAVÉS DE OBJETOS, Y LOS OBJETOS
        //SE CREAN CON LA PALABRA new
        sInput = new Scanner(System.in);
        //Scanner sInput = new Scanner(System.in);
        // int iVal = 10;
        sNombre = sInput.nextLine();//cuando el usuario da "enter"
        System.out.println("Tu nombre es: " + sNombre);
    
    }
    
}

/*
 Práctica para evaluar el impacto de los tipos de datos en la construcción de
 programa.
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
        //DECLARACION DE UN ARREGLO --> lista de variables del mismo tipo
        //(tipo de dato) (nombre del identificador)
        //int[] iArreglo = new int[1000000000]; //UN ARREGLO DE 4GB
        
        byte[] iArregloByte = new byte[1000000000]; //UN ARREGLO DE 1GB
        System.out.println("hola mondo" + iArregloByte);
    }
    
}

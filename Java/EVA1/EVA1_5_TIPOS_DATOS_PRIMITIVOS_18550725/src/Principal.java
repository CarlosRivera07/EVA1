/*
 * eJEMPLO DE CADA UNO DE LOS TIPOS DE DATOS, DECLARACION E INICIALIZACION DE 
VARIABLES Y CONSTANTES
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
        //variable, entera, ocupa 4 bytes, donde existe
        int iDato;//declaracion de la variable
        //iDato = 10.5;//define operaciones para enteros
                     // NO PODEMOS asignarle valores diferentes
        //System.out.println(iDato); //nos imprimiría cero             
        int  iVal = 10; // declarando e inicializando
        String sCade = "hola mundo";
        System.out.println(sCade.length());
        //CONSTANTES --> MAYÚSCULAS
        final double PI = 3.1416;
        System.out.println(PI);
    }
    
}

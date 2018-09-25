
import java.util.Scanner;

/*
 * PROGRAMA QUE CALCULA TU FECHA DE NACIMIENTO
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
        //CAPTURA A TRAVÉS DE UN ESCANER
        Scanner Input = new Scanner(System.in);
        System.out.println("Ingresa tu nombre: ");
        String  sNombre;
        sNombre = Input.nextLine();
        
        System.out.println("Ingresa tu edad: ");
        int iEdad;
        iEdad = Input.nextInt();
        
        int iAño;
        iAño = 2018 - iEdad;
        
        System.out.println("Tu nombe es: " + sNombre);
        
        System.out.println("Tu año de nacimiento es: " + iAño);
        
        
    }
    
}

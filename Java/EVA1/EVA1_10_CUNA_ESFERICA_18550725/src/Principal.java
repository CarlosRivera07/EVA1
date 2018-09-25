
import java.util.Scanner;

/*
 * ingresar los valores que soolicita para poder obtener el valor del volumen
de la cuña esferica
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
    Scanner Input = new Scanner(System.in);
        System.out.println("Introduce el valor del radio: ");
        double rRadio;
        rRadio = Input.nextDouble();
        
        System.out.println("Introduce el valor del ángulo: ");
        double rAngulo;
        rAngulo = Input.nextDouble();
        
        double rVolumen;
        rVolumen = (double) 3/4*(3.1416*Math.pow(rRadio,3)/360*rAngulo);
        System.out.println("El volumen de la cuña es: " + rVolumen);
            
    }
    
}

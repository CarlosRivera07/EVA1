
import java.util.Scanner;

/*
 * Preguntar la velocidad inicial, velocidad final y el tiempo para obtenr la 
distancia con su respectiva formula
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
        System.out.println("Introduce la Velocidad Inicial: ");
        double rVelIn;
        rVelIn = Input.nextDouble();
        
        System.out.println("Introduce Velocidad Final: ");
        double rVelFin;
        rVelFin = Input.nextDouble();
        
        System.out.println("Introduce el Tiempo: ");
        double rTiempo;
        rTiempo = Input.nextDouble();
        
        double rDistancia;
        rDistancia = (rVelIn + rVelFin)/2 * rTiempo;
        System.out.println("La distancia es: ");
        System.out.println(rDistancia + "m/s");
        
    }
    
}

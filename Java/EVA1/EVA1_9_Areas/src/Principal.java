
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
        System.out.println("Ingresa el valor de la base mayor(B): ");
        double rBmayor;
        rBmayor = Input.nextDouble();
        
        System.out.println("Ingresa el valor de la base menor (b): ");
        double rBmenor;
        rBmenor = Input.nextDouble();
        
        System.out.println("Ingresa el valor de la altura (h): ");
        double rAltura;
        rAltura = Input.nextDouble();
    
        double rArea;
        rArea = ((rBmayor + rBmenor)*2 /2);
        System.out.println("El área de tu trapecio es:" + rArea + "m2");
        
    }
    
}

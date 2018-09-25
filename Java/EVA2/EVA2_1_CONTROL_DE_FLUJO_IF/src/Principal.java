
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
        System.out.println("Que calificacion obtuviste en Fundamentos de la Programación: ");
        double rCalifa = Input.nextDouble();
        
        if(rCalifa >= 70){//BLOQUE PARA TRUE
            System.out.println("Pasaste");
        } else{ //BLOQUE PARA FALSE(OPCIONAL)
            System.out.println("No Pasaste");
        }
        
    }
    
}

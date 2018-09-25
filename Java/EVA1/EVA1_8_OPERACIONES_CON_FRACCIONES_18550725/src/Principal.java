
import java.util.Scanner;

/*
 * INGRESAR EL NUMERADOR Y EL DENOMINADOR DE DS FRACCIONES Y REALIZAR UNA SUMA
RESTA, MULTIPLICACION Y DIVISION
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
        System.out.println("Ingresa el valor del numerador de la fracción 1: ");
        int iFN1;
        iFN1 = Input.nextInt();
        
        System.out.println("Ingresa el valor del denominador de la fracción 1: ");
        int iFD1;
        iFD1 = Input.nextInt();
        
        System.out.println("Ingresa el valor del numerador de la fracción 2: ");
        int iFN2;
        iFN2 = Input.nextInt();
        
        System.out.println("Ingresa el valor del denominador de la fracción 2: ");
        int iFD2;
        iFD2 = Input.nextInt();
        
        System.out.println("Las operaciones por resolver son las siguientes: ");
        System.out.println(Integer.toString(iFN1) + "/" + iFD1 + " + " + iFN2 + "/" + iFD2);
        System.out.println(Integer.toString(iFN1) + "/" + iFD1 + " - " + iFN2 + "/" + iFD2);
        System.out.println(Integer.toString(iFN1) + "/" + iFD1 + " * " + iFN2 + "/" + iFD2);
        System.out.println(Integer.toString(iFN1) + "/" + iFD1 + " / " + iFN2 + "/" + iFD2);
        
        int iSuma1;
        iSuma1 = (iFN1 * iFD2) + (iFD1 * iFN2);
        
        int iSuma2;
        iSuma2 = (iFD1 * iFD2);
        
        System.out.println("El resultado de la suma es: " + iSuma1 + "/" + iSuma2);
        
        int iResta1;
        iResta1 = (iFN1 * iFD2) - (iFD1 * iFN2);
        
        int iResta2;
        iResta2 = (iFD1 * iFD2);
        
        System.out.println("El resultado de la resta es: " + iResta1 + "/" + iResta2);
        
        int iMultiplicacion1;
        iMultiplicacion1 = (iFN1 * iFN2);
        
        int iMultiplicacion2;
        iMultiplicacion2 = (iFD1 * iFD2);
        
        System.out.println("El resultado de la multiplicación es:" + iMultiplicacion1 + "/" + iMultiplicacion2);
        
        int iDivision1;
        iDivision1 = (iFN1 * iFD2);
        
        int iDivision2;
        iDivision2 = (iFD1 * iFN2);
        
        System.out.println("El resultado de la división es: " + iDivision1+ "/" + iDivision2);
        
        
    }
    
}

/*Escriba un programa en el cual se ingrese un valor límite positivo, 
*y a continuación solicite números al usuario hasta que la suma de los números 
*introducidos supere el límite inicial.
*/
package guía.pkg3.estructuras.de.control.y.repetitivas;

import java.util.Scanner;

/**
 * @author ailen
 */
public class Ejer5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner leer = new Scanner(System.in);
        int n1, n2, c;
        
        System.out.println("Ingrese un valor positivo como limite");
        n2 = leer.nextInt();
        
        do {
            
            System.out.println("Ingrese un valor posotivo");
            n1 = leer.nextInt();
            c = 0;
            c = c + n1;
            
        } while (c <= n2);
        
    }
    
}


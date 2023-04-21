/* Implementar un programa que le pida dos números enteros al usuario y
* determine si ambos o alguno de ellos es mayor a 25.
* (n1 > 25 && n2 > 25) || (n1 < 25 && n2 < 25)
*/

package guía.pkg3.estructuras.de.control.y.repetitivas;

import java.util.Scanner;

/**
 *
 * @author ailen
 */

public class EjerT6 {
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
       System.out.println("Ingrese el primer valor");
       int n1 = leer.nextInt();
       System.out.println("Ingrese el segundo valor");
       int n2 = leer.nextInt();
       
       if (n1 < 25 && n2 > 25) {
           System.out.println("El valor mayor a 25 es el segundo número.");
           } else if (n1 > 25 && n2 < 25); {
               System.out.println("El valor mayor a 25 es el primero número.");
           } else {
              System.out.println("Ambos, o ninguno, son (o no) mayor a 25.");
    }
   
}
    
}


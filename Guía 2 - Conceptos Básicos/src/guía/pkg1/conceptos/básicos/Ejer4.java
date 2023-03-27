/* Dada una cantidad de grados centígrados se debe mostrar su
* equivalente en grados Fahrenheit. La fórmula correspondiente es: F = 32
* + (9 * C / 5).
*/
package guía.pkg1.conceptos.básicos;

import java.util.Scanner;

/**
 *
 * @author ailen
 */
public class Ejer4 {
       public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in); 
           System.out.println("Ingresar los grados centígrados a convetir.");
        
           int grados = leer.nextInt(); 
           double gradosF = 32 + (9 * grados / 5) ;
        
           System.out.println("Los grados convertidos son: " + gradosF + " grados Fahrenheit.");
        
        
        
    }
}




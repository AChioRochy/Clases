/* Escribir un programa que lea un número entero por teclado y muestre
* por pantalla el doble, el triple y la raíz cuadrada de ese número.
* Nota: investigar la función Math.sqrt().
*/
package guía.pkg1.conceptos.básicos;

import java.util.Scanner;

/**
 *
 * @author ailen
 */
public class Ejer5 {
   public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
    
        System.out.println("Escribir un valor");
        
        int num = input.nextInt();
        
        System.out.println("El doble es " + (num*2) + ", el triple es " + (num*3) + " y la raíz cuadrada es " + Math.sqrt(num));
             
    }
}



/*
* /*Crear un programa que dado un número determine si es par o impar.
*/
package guía.pkg3.estructuras.de.control.y.repetitivas;

import java.util.Scanner;

/**
 *
 * @author ailen
 */
public class Ejer1 {
    public static void main(String[] args) {
       
        Scanner leer = new Scanner(System.in);
     
        System.out.println("Ingrese un valor.");
        
        int num = leer.nextInt();
        
        if (num % 2 == 0) {
            System.out.println("Sí es par");
        } 
        
        else {
            System.out.println("No es par");
        }
     
   }     
}

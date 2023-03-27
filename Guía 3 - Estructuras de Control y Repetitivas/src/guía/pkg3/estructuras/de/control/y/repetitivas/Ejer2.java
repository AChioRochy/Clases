/*
* Crear un programa que pida una frase y si esa frase es igual a “eureka” el
* programa pondrá un mensaje de Correcto, sino mostrará un mensaje de
* Incorrecto. Nota: investigar la función equals() en Java.
*/
package guía.pkg3.estructuras.de.control.y.repetitivas;

import java.util.Scanner;

/**
 *
 * @author ailen
 */
public class Ejer2 {
    public static void main(String[] args) {
       
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Infrese la frase");
        
        String frase = leer.next();
        String frase2 = "Eureka";
        
        if (frase.equals("eureka")) {
            System.out.println("La frase es correcta");
        } 
        else {
            System.out.println("la frase es incorrecta");
        }
   }     
}

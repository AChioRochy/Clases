/* Escribir un programa que pida una frase y la muestre toda en mayúsculas
* y después toda en minúsculas.
* Nota: investigar la función toUpperCase() y toLowerCase() en Java.
*/ 
package guía.pkg1.conceptos.básicos;

import java.util.Scanner;

/**
 *
 * @author ailen
 */
public class Ejer3 {
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
    
        System.out.println("====================================");
        System.out.println("Frase Original");
        String frase = leer.nextLine();
        System.out.println("====================================");
        System.out.println("Frase en Minusculas");
        System.out.println(frase.toLowerCase());
        System.out.println("====================================");
        System.out.println("Frase en Mayusculas");
        System.out.println(frase.toUpperCase());
        System.out.println("====================================");
                
        
        
    }
}


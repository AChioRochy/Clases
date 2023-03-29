/*Escriba un programa que pida una frase o palabra    
 * y valide si la primera letra de esa frase es una ‘A’.
 * Si la primera letra es una ‘A’, se deberá de imprimir
 * un mensaje por pantalla que diga “CORRECTO”, en caso contrario,
 *se deberá imprimir “INCORRECTO”. 
 *Nota: investigar la función Substring y equals() de Java.
*/

package guía.pkg3.estructuras.de.control.y.repetitivas;

import java.util.Scanner;

/**
 *
 * @author ailen
 */
public class Ejer4 {
    public static void main(String[] args) {
       
       Scanner leer = new Scanner(System.in);
       String frase, o;
       
       System.out.println("Ingresa la frase o palabra");
       
       frase = leer.nextLine();
       o = frase.substring(0,1);
       
       if (o.equals ("a")) {
           System.out.println("Es correcto");
       }
       else   { 
           System.out.println("Es incorrecto");
        }
 }          
}

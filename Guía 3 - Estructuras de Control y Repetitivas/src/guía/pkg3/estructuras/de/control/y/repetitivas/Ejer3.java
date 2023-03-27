/*Realizar un programa que solo permita introducir
 *solo frases o palabras de 8 de largo. 
 *Si el usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir 
 *un mensaje por pantalla que diga “CORRECTO”, en caso contrario, 
 *se deberá imprimir “INCORRECTO”. 
 *Nota: investigar la función Lenght() en Java.
 */

package guía.pkg3.estructuras.de.control.y.repetitivas;

import java.util.Scanner;

/**
 *
 * @author ailen
 */
public class Ejer3 {
    public static void main(String[] args) {
        
       Scanner leer = new Scanner(System.in);
       String frase;
       
       System.out.println("Ingresa la frase");
       frase = leer.nextLine();
       
       int num = frase.length();
       
       if (num==8) {
           System.out.println("La frase es correcta");
        } 
       else {
           System.out.println("La frase es incorrecta");
       }
       
       
    }
}

/*
* Escribir un programa que pida tu nombre, lo guarde en una variable y lo
* muestre por pantalla.
* 
*/
package guía.pkg1.conceptos.básicos;

import java.util.Scanner;

/**
 *
 * @author ailen
 */
public class Ejer2 {
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
    
        System.out.println("Ingrese su nombre, por favor.");
        
        String nombre = leer.nextLine();
        
        System.out.println("Bienvenida, " + nombre );
        
        
        
    }
}
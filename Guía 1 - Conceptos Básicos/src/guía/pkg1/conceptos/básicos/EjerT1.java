/*
* Ejemplo básico de programación.
*/

package guía.pkg1.conceptos.básicos;

import java.util.Scanner;

/**
 *
 * @author ailen
 */

public class EjerT1 {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        String nombre;
        
        System.out.println("Ingresar tu nombre");
        
        nombre = leer.next();
        
        System.out.println("Hola Mundo! Soy " + nombre + "Y estoy programando en Java!");
        
    }
}

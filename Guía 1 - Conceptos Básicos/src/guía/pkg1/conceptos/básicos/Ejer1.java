/*
* Escribir un programa que pida dos números enteros por teclado y calcule
* la suma de los dos. El programa deberá después mostrar el resultado de
* la suma.
*/
package guía.pkg1.conceptos.básicos;

import java.util.Scanner;

/**
 *
 * @author ailen
 */
public class Ejer1 {
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
    
        System.out.println("Ingrese dos números por favor");
        
        int n1 = leer.nextInt();
        int n2 = leer.nextInt();
        
        System.out.println("La suma de los valores es: " + (n1 + n2) );
        
    }
    
}


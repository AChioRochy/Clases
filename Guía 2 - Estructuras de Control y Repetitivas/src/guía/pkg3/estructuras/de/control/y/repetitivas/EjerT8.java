/*
* Escriba un programa que valide si una nota está  entre 0 y 10, sino está entre 0
* y 10 la nota se pedirá de nuevo hasta que la nota sea correcta.
*/
package guía.pkg3.estructuras.de.control.y.repetitivas;

import java.util.Scanner;

/**
 *
 * @author ailen
 */
public class EjerT8 {
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
  		 
   	int nota = 0;
        
        System.out.println("Ingresa tu nota");
        
   	while (nota <= 10) {
      	 
    	nota = leer.nextInt();
        
        System.out.println("Vuleve a ingresar tu nota");
     
      	 }	

    }
    
}


/*
Crear un programa que dibuje una escalera de números, donde cada
línea de números comience en uno y termine en el número de la línea.
Solicitar la altura de la escalera al usuario al comenzar.
*/
package guía.pkg3.estructuras.de.control.y.repetitivas;

import java.util.Scanner;

/**
 *
 * @author ailen
 */

public class Extra13 {
   public static void main(String[] args) {
       
       Scanner leer = new Scanner(System.in);
       
       System.out.println("Ingrese valor de escalones: ");
        
        int ingresoEscalones = leer.nextInt();

        for (int i = 0; i < ingresoEscalones + 1; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(j + 1);
            }
            System.out.println();
        }
       
} 
}

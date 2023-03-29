/*
* Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima
* el número ingresado seguido de tantos asteriscos como indique su valor. 
* Por ejemplo:
   5 *****
   3 ***
   11 ***********
   2 **
*/
package guía.pkg3.estructuras.de.control.y.repetitivas;

import java.util.Scanner;

/**
 *
 * @author ailen
 */
public class EjerT10 {
    
    public static void main(String[] args) {
       
        int numIngresado, contador;

        Scanner leer = new Scanner(System.in);
        contador = 0;

        do {

            System.out.print("Ingrese un numero entre 1 y 20: ");
            numIngresado = leer.nextInt();

            if ((numIngresado > 0) && (numIngresado <= 20)) {
                System.out.print(numIngresado + " ");
                for (int i = 1; i <= numIngresado; i++) {
                    System.out.print("*");
                }
            } else {
                System.out.println("Solo imprimiremos los caso entre 1 y 20");
            }
            //
            contador++;
            System.out.println("");

        } while (contador < 4);      
         
   }     
}

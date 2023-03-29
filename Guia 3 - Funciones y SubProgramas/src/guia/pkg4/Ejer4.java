/*
*Crea una aplicación que nos pida un número por teclado y con una
*función se lo pasamos por parámetro para que nos indique si es o no un
*número primo, debe devolver true si es primo, sino false.
*/

package guia.pkg4;

import java.util.Scanner;

/**
 *
 * @author ailen
 */

public class Ejer4 {
    public static void main(String[] args) {
    
        Scanner leer = new Scanner(System.in);
    
        double ingresado;
        boolean primo;
        
        System.out.println("Ingrese un numero para saber si es o no primo: ");
        ingresado = leer.nextDouble();
        primo = primoONo(ingresado);
        System.out.println("El valor es primo: " + primo);

    }

    public static boolean primoONo(double param) {
        boolean primo = true;
        
        if (param == 0 || param == 1) {
            System.out.println("No es primo ni compuesto");
            primo = false;

        } else if (param == 2) {
            primo = true;
        } else {
            for (int i = 2; i <= param - 1; i++) {
                if (param % i == 0) {
                    primo = false;
                    break;
                } else {
                    primo = true;
                }
            }

        }
        return primo;

    }
}
/*
Escriba un programa que lea números enteros. Si el número es múltiplo
de cinco debe detener la lectura y mostrar la cantidad de números
leídos, la cantidad de números pares y la cantidad de números impares.
Al igual que en el ejercicio anterior los números negativos no deben
sumarse. Nota: recordar el uso de la sentencia break.
*/

package guía.pkg3.estructuras.de.control.y.repetitivas;

import java.util.Scanner;

/**
 *
 * @author ailen
 */
public class Extra8 {
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        int contador = 0;
        double ingresado, totalPares, totalImpares;
        
        totalPares = 0;
        totalImpares = 0;
        
        do {
            
            System.out.println("Ingrese un número entero POSITIVO: ");
            ingresado = leer.nextDouble();
            if (ingresado < 0) {
                System.out.println("Solo numeros positivos");
                break;
            }
            if (ingresado % 2 == 0) {
                totalPares++;
            } else {
                totalImpares++;
            }
            contador++;

        } while ((ingresado % 5) != 0);

        System.out.println("El total de leidos es: " + contador);
        System.out.println("Fueron pares: " + (totalPares));
        System.out.println("Fueron impares: " + (totalImpares));
    }
}
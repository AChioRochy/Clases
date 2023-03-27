/*
Realice un programa que calcule y visualice el valor máximo, el valor
mínimo y el promedio de n números (n>0). El valor de n se solicitará al
principio del programa y los números serán introducidos por el usuario.
Realice dos versiones del programa, una usando el bucle “while” y otra
con el bucle “do - while”.
*/

package guía.pkg3.estructuras.de.control.y.repetitivas;

import java.util.Scanner;

/**
 *
 * @author ailen
 */
public class Extra7 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out
                .println("Ingrese el valor");
        int N = leer.nextInt();
       
        int contador = 0;
        double ingresado, total, promedio;
        total = 0;
        promedio = 0;
      

        while (contador < N) {
            System.out.println("Ingrese un número: ");
            ingresado = leer.nextDouble();
            if (ingresado < 0) {
                System.out.println("Solo números positivos");
                continue;
            }
            total = total + ingresado;
            contador++;
        }
        System.out.println("El total es " + total);
        System.out.println("El promedio es: " + (total / N));
}
}
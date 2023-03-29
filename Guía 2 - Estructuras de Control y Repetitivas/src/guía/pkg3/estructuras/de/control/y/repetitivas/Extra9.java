/*
Simular la división usando solamente restas. Dados dos números enteros
mayores que uno, realizar un algoritmo que calcule el cociente y el
residuo usando sólo restas. Método: Restar el dividendo del divisor hasta
obtener un resultado menor que el divisor, este resultado es el residuo, y
el número de restas realizadas es el cociente.
*/

package guía.pkg3.estructuras.de.control.y.repetitivas;

import java.util.Scanner;

/**
 *
 * @author ailen
 */
public class Extra9 {
    public static void main(String[] args) {
       
        Scanner leer = new Scanner(System.in);
        
        int ingresado, segundoIngresado, cociente, resto;
        
        System.out.println("Ingrese primer numero positivo: ");
        ingresado = leer.nextInt();
        System.out.println("Ingrese segundo numero positivo: ");
        segundoIngresado = leer.nextInt();
        
        resto = 0;
        cociente = 0;
       
        
        do {
            resto = ingresado - segundoIngresado;
            cociente++;
            ingresado = resto;
        } while (resto > segundoIngresado);

        
        System.out.println("Cociente es: " + cociente);
        System.out.println("Resto es: " + resto);
    }
}
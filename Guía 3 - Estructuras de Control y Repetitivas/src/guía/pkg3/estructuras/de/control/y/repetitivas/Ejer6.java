/*Realizar un programa que pida dos números enteros positivos por teclado y 
*muestre por pantalla el siguiente menú:El usuario deberá elegir una opción y 
*el programa deberá mostrar el resultado por pantalla y luego volver al menú. 
*El programa deberá ejecutarse hasta que se elija la opción 5. 
*Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir del
*programa directamente, se debe mostrar el siguiente mensaje de confirmación: 
*¿Está seguro que desea salir del programa (S/N)? 
*Si el usuario selecciona el carácter ‘S’ se sale del programa, 
*caso contrario se vuelve a mostrar el menú.
*/

package guía.pkg3.estructuras.de.control.y.repetitivas;

import java.util.Scanner;

/**
 *
 * @author ailen
 */
public class Ejer6 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int opcion;
        System.out.println("Ingrese dos numeros por favor");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
       

        do {
            System.out.println("MENU");
            System.out.println("");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.println("");
            System.out.println("Elija opcion:");
            
            opcion = leer.nextInt();
            
            switch (opcion) {
               
                case 1:
                System.out.println("");
                System.out.println("La suma de " + num1 + " y de "+ num2 + " es: " + (num1 + num2));
                System.out.println("");
                break;
           
            case 2:
                System.out.println("");
                System.out.println("La resta de " + num1 + " y de "+ num2 + " es: " + (num1 - num2));
                System.out.println("");
                break;
          
            case 3: 
                System.out.println("");
                System.out.println("La multiplicación de " + num1 + " y de " + num2 + " es: " + (num1 * num2));
                System.out.println("");
                break;
            
            case 4: 
                System.out.println("");
                System.out.println("La división de " + num1 + " y de " + num2 + " es: " + (num1 / num2));
                System.out.println("");
                break;
                
            case 5: System.out.println("¿Está seguro que desea salir del programa (s/n)?");
                       String rta = leer.nextLine();
                       if(rta.equals("s")){
                        int aux = 6;
                        System.out.println("Muchas gracias por utilizar nuestro sistema");
                        }
                       break;

            }

        } while (oopcion!= 5);
           
    }
    }

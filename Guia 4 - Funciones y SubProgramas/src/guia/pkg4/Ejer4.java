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
    int num;
    System.out.println(" Ingresar un valor numérico ");
    num = leer.nextInt();
    
}
    
     public static void primo(int num) {
    
         if (num = num / 1 && num = num / num) {
          System.out.println(" Verdadero ");
         }
         else {
             System.out.println(" Falso ");
         }
    }
}
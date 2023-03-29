/*
 * Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”.
 * 
 * 
 */
package guía.pkg3.estructuras.de.control.y.repetitivas;

import java.util.Scanner;

/**
 *
 * @author ailen
 */
public class Ejer8 {
    public static void main(String[] args) {
      
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese el número de elementos por lado del cuadrado: ");
        
        int elementosPorLado = leer.nextInt();
        
        for (int i = 1; i <= elementosPorLado; i++) {
            for (int j = 1; j <= elementosPorLado; j++) {
                if ((i == 1) || (i == elementosPorLado)) {
                    System.out.print("*");
                } else if ((j == 1) || (j == elementosPorLado)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}


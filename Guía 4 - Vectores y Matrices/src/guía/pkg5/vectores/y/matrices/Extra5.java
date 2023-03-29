/*
* Realizar un programa que llene una matriz de tamaño NxM con valores
* aleatorios y muestre la suma de sus elementos.
*/

package guía.pkg5.vectores.y.matrices;

import java.util.Scanner;

/**
 *
 * @author ailen
 */

public class Extra5 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese la dimensión de la matriz.");
        int f = leer.nextInt();
        int c = leer.nextInt();
        
        int[][] matriz = new int[f][c];
    
    for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = (int) (Math.random() * 10);
            }
        }
        
        System.out.println("=======Matriz=======");
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("=======Matriz=======");
        
        System.out.println("");
        
        int suma = 0;
       
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = (int) (Math.random() * 10);
                suma += matriz[i][j];
            }
        }
        System.out.println("La suma de sus elementos es " + suma);
        System.out.println("");
    }
    
    
}
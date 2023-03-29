/*
* Escriba un programa que averigüe si dos vectores de N enteros son
* iguales (la comparación deberá detenerse en cuanto se detecte alguna
* diferencia entre los elementos).
* 
*/

package guía.pkg5.vectores.y.matrices;

import java.util.Scanner;

/**
 *
 * @author ailen
 */

public class Extra2 {
    public static void main(String[] args) { 
        
        Scanner leer = new Scanner(System.in);  
        
        System.out.println("Ingresar el tamaño del Vector 1.");
        int n1 = leer.nextInt();
        int[] vec1 = new int[n1];
        for (int i = 0; i < vec1.length ; i++) {
          vec1[i] = (int) (Math.random() * 10);
        }
        String aux = "";
        for (int d : vec1) {
            aux += " " + d;
        }
        System.out.println("==============================");
         System.out.println("Primer Vector.");
         System.out.println(aux);
        System.out.println("==============================");
        
        System.out.println("Ingresar el tamaño del Vector 2.");
        int n2 = leer.nextInt();
        int[] vec2 = new int[n2];
        for (int i = 0; i < vec2.length ; i++) {
          vec2[i] = (int) (Math.random() * 10);
        }
        String aux1 = "";
        for (int d : vec2) {
            aux1 += " " + d; 
        }
        
        System.out.println("==============================");
            System.out.println("Segundo Vector.");
            System.out.println(aux1);
        System.out.println("==============================");
        
        if (vec1 == vec2) {
            System.out.println("Ambos vectores son gemelos.");

        } else {
            System.out.println("Los vectores son distintos.");
        }
        System.out.println("");
        
   } 
}


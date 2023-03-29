/*
Realizar un algoritmo que calcule la suma de todos los elementos de un
vector de tamaño N, con los valores ingresados por el usuario.
*/

package guía.pkg5.vectores.y.matrices;

import java.util.Scanner;

/**
 *
 * @author ailen
 */

public class Extra1 {
    public static void main(String[] args) { 
        
        Scanner leer = new Scanner(System.in);   
    
        System.out.println("Ingresar el tamaño del Vector.");
        
        int N = leer.nextInt();
        
        int[] vector = new int[N];
        
        int total = 0;
        
        System.out.println("===================================");
        
        for (int i = 0; i < vector.length ; i++) {
            System.out.println("Ingresar el valor del Vector.");
            vector[i] = leer.nextInt();
            total += vector[i];
        }
        
        String aux = "";
           
        for (int d : vector) {
            aux += " " + d; 
        }
        
        System.out.println("==============================");
            System.out.println("Vector del Usuario.");
            System.out.println(aux);
        System.out.println("==============================");
            System.out.println("La suma total es:" + total);
        System.out.println("==============================");
        
        
    }
}

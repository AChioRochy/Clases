// Realizar un algoritmo que llene un vector con los 100 primeros números
// enteros y los muestre por pantalla en orden descendente.

package guía.pkg5.vectores.y.matrices;

// @author ailen 

import java.util.Scanner;

// @param args the command line arguments 

public class Ejer1 {
   public static void main(String[] args) { 
       
    Scanner leer = new Scanner(System.in);   
    int[] vector =  new int [100];
    
    for (int i = 1; i < vector.length - 0; i++) {
            vector[i] = i;
        }
        
        String aux = "";
        
    for (int i = vector.length; i >= 0; i--) {
            aux += " " + i;
        }
    
        System.out.println(aux);
    
    }
}
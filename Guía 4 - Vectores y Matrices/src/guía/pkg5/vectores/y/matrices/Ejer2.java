// Realizar un algoritmo que llene un vector de tamaño N con valores
//aleatorios y le pida al usuario un número a buscar en el vector. El
//programa mostrará dónde se encuentra el numero y si se encuentra
//repetido.

package guía.pkg5.vectores.y.matrices;

// @author ailen 

import java.util.Scanner;

// @param args the command line arguments 

public class Ejer2 {
   
        public static void main(String[] args) { 
       
            Scanner leer = new Scanner(System.in);  
                    
            System.out.println("Ingresar el tamaño del vector");
            int num = leer.nextInt();
            int[] vector =  new int [num];
            
            for (int i = 1; i < vector.length - 1; i++) {
            vector[i] = (int) (Math.random()*10+1);
           
        }
            
        String aux = "";
           
        for (int d : vector) {
            aux += " " + d; 
        }
            System.out.println("Vector Aleatorio");
            System.out.println(aux);
            
        int adivinado = 0;
        boolean gano = false;
        
        System.out.println("Adivine alguno de los numeros que hay en el vector - Del 0 al 10: ");
        
        int respuesta = leer.nextInt();
        
        for (int i = 0; i < vector.length; i++) {
            
            if (vector[i] == respuesta) {
                adivinado++;
                gano = true;
            }

        }
        
        System.out.println("Adivino: " + gano);
        System.out.println("Una cantidad de: " + adivinado + " veces");
          
  }
}
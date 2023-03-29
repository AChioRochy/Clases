// Realice un programa que compruebe si una matriz dada es antisimétrica.
// Se dice que una matriz A es antisimétrica cuando ésta es igual a su
// propia traspuesta, pero cambiada de signo. Es decir, A es antisimétrica si
// A = -AT. La matriz traspuesta de una matriz A se denota por AT y se
// obtiene cambiando sus filas por columnas (o viceversa).

package guía.pkg5.vectores.y.matrices;

// @author ailen 

import java.util.Scanner;

// @param args the command line arguments 

public class Ejer5 {
   public static void main(String[] args) { 
       
    Scanner leer = new Scanner(System.in);   
    
    int[][] matriz = new int[4][4];
    
    for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = (int) (Math.random() * 10);
            }
        }
        
        System.out.println("=======Matriz Original=======");
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        
        int[][] traspuestaCambiadaDeSigno = new int[4][4];
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                traspuestaCambiadaDeSigno[j][i] = -matriz[i][j];
            }
        }
      
        System.out.println("=======Traspuesta Antisimétrica=======");
        
        for (int i = 0; i < traspuestaCambiadaDeSigno.length; i++) {
            for (int j = 0; j < traspuestaCambiadaDeSigno.length; j++) {
                System.out.print(traspuestaCambiadaDeSigno[i][j] + " ");
            }
            System.out.println();
        }
        
        int[][] matrizC = {{0, 1, -2}, {-1, 0, -3}, {2, 3, 0}};
        
        boolean esAntisimetrica = true;
        
        // Comprobar si la matriz es antisimétrica
        
        for (int i = 0; i < matrizC.length; i++) {
            for (int j = 0; j < matrizC[i].length; j++) {
                if (matrizC[i][j] != -matrizC[j][i]) {
                    esAntisimetrica = false;
                    break;
                }
            }
            if (!esAntisimetrica) {
                break;
            }
        }
        // Mostrar el resultado
             System.out.println("============================");
        
        if (esAntisimetrica) {
            System.out.println("La matriz es antisimétrica.");
        } else {
            System.out.println("La matriz no es antisimétrica.");
        }
        
        System.out.println("============================");
    }
}

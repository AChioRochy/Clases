//Recorrer un vector de N enteros contabilizando cuántos números son de
//1 dígito, cuántos de 2 dígitos, etcétera (hasta 5 dígitos).

package guía.pkg5.vectores.y.matrices;

// @author ailen 

import java.util.Scanner;

// @param args the command line arguments 

public class Ejer3 {
   public static void main(String[] args) { 
       
    Scanner leer = new Scanner(System.in);   
    int[] vector = { 100, 2, 5 };
        
        String aux = "";
        
        for (int i : vector) {
            aux = "" + i;
            System.out.println("El elemento: " + aux + " tiene un "
            + "total de: " + aux.length() + " dígitos.");
           }
    }
}
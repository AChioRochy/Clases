/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nota.buclemientras;

import java.util.Scanner;

/**
 *
 * @author ailen
 */
public class NotaBucleMientras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
  	 
   	int nota = 0;
        
        System.out.println("Ingresa tu nota");
        
   	while (nota <= 10) {
      	 
    	nota = leer.nextInt();
        
        System.out.println("Vuleve a ingresar tu nota");

    }
    
}

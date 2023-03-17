/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sum;

import java.util.Scanner;

/**
 *
 * @author ailen
 */
public class Sum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int num1, num2, sum;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Ingrese el número 1");
        num1 = input.nextInt();
        
        System.out.println("Ingrese el número 2");
        num2 = input.nextInt();
        
        sum = num1 + num2;
        
        System.out.println("La suma de " + num1 + " + " + num2 + " = " + sum);
        input.close();
            
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication27;

import java.util.Scanner;

/**
 *
 * @author ailen
 */
public class JavaApplication27 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
       int num;
       int contp=0;
        int conti=0;
        do{
        
        System.out.println("Ingrese numeros enteros positivos");
        
                num = leer.nextInt();
        
        if (num % 2 == 0){
            System.out.println("sumamos numeros pares"); 
            contp=contp+1;
           // System.out.println("la cantidad de numeros pares ingresados son: " + contp);
        }else {
            System.out.println("sumamos numeros impares");
            conti=conti+1;
            //System.out.println("la cantidad de numeros impares son : " + conti);
        }
        
            
        } while (num % 5 != (0)); 
        System.out.println("la cantidad de numeros pares ingresados son: " + contp );
        System.out.println("la cantidad de numeros pares ingresados son: " + conti );
    }
    }
    


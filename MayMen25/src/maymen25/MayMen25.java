/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maymen25;

import java.util.Scanner;

/**
 *
 * @author ailen
 */
public class MayMen25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
       Scanner leer = new Scanner(System.in);
       int n1;
       int n2;
       System.out.println("Ingrese el primer valor");
       n1 = leer.nextInt();
       System.out.println("Ingrese el segundo valor");
       n2 = leer.nextInt();
       
       if (n1 > 25 && n2 > 25) {
           System.out.println("Ambos valores son mayores a 25");
       }else {
        System.out.println("Ambos valores son menores a 25");
       }
       if (n1 > 25 && n2 < 25) {
           System.out.println("El primer valor es mayor a 25, el seguno es menor");
       }else (n1 < 25 && n2 > 25) {
        System.out.println("El segundo valor es mayor a 25, el primero es menor");
    }
    }
    
    
}


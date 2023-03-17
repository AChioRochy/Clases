/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Doble-Triple-RaizCuadrada;

/**
 *
 * @author ailen
 */
public class Doble-Triple-RaizCuadrada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int num; 
        System.out.println("Escribir un valor");
        num = input.nextInt();
        System.out.println("El doble es " + (num*2) + ", el triple es " + (num*3) + " y la raíz cuadrada es " + Math.sqrt(num));
    }
    
}

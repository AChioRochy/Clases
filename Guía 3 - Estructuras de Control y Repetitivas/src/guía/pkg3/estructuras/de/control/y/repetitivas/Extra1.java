/*
 * Dado un tiempo en minutos, calcular su equivalente en días y horas. 
 */
package guía.pkg3.estructuras.de.control.y.repetitivas;

import java.util.Scanner;

/**
 *
 * @author ailen
 */
public class Extra1 {
     public static void main(String[] args) {
        double tiempoMinutos, dias, horas;

        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese un valor de tiempo en minutos: ");
        tiempoMinutos = leer.nextDouble();

        horas = tiempoMinutos / 60;
        dias = horas / 24;

        horas = horas - (Math.floor(dias) * 24); 
       
        dias = Math.floor(dias); 

        System.out.println(dias + " Dias");
        System.out.println(horas + " Horas");
    }
    
}


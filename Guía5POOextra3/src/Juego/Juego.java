/*
Crea una clase "Juego" que tenga un método "iniciar_juego" que permita
a dos jugadores jugar un juego de adivinanza de números. El primer
jugador elige un número y el segundo jugador intenta adivinarlo. El
segundo jugador tiene un número limitado de intentos y recibe una pista
de "más alto" o "más bajo" después de cada intento. El juego termina
cuando el segundo jugador adivina el número o se queda sin intentos.
Registra el número de intentos necesarios para adivinar el número y el
número de veces que cada jugador ha ganado.
*/

package Juego;

import java.util.Scanner;

/**
 *
 * @author ailen
 */

public class Juego {
    
    Scanner leer = new Scanner(System.in);
    
    private int num;
    private int num2;
    private int intentos;

    public Juego() {
    }
    

    public void iniciarJuego(){
        
        System.out.println("========\nPlayer 1\n========\nIngrese el número a adivinar");
        num = leer.nextInt();
        
        intentos = 0;
        System.out.print("========\nPlayer 2\n========\nAdivina el número >> ");
        
        while (intentos < 4){
            
            num2 = leer.nextInt();
            intentos++;
            
            if (num2 == num) {
                System.out.println("======================================");
                System.out.println("¡Felicitaciones! adivinaste el número");
                System.out.println("======================================");
                System.out.println("Cantidad de intentos realizados: " + intentos );
                break;
            }
            
            if (intentos < 4){
                if (num2 > num) {
                System.out.println("¡Más Bajo!");
                } else {
                System.out.println("¡Más Alto!");
                }
                System.out.println("=== " + (4 - intentos) + " intento/s restante/s ===");
            }
            
        }
        
        if (intentos == 4) {
            System.out.println("=============");
            System.out.println("¡¡¡¡GAME OVER!!!!");
            System.out.println("=============");
        }
    
    }
    
}
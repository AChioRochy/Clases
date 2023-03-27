/* Utilizando un bucle ‘for’, 
 * aloja en el vector Equipo, 
 * los nombres de tus compañeros de equipo.
 * Natalia, Aldo, Ailen, Emilia, Lucia, 
 * Sergio, Marcelo, Humberto, Maria
 */
package guía.pkg5.vectores.y.matrices;

import java.util.Scanner;

/**
 *@author ailen
 */
public class EjerT14 {
 /**
 * @param args the command line arguments
 */  
    
    
 public static void main(String[] args) {
      
     Scanner leer = new Scanner(System.in);
     String[] Equipo = new String[9];
     
     
     for (int i = 0; i < Equipo.length ; i++){
        
        Equipo[0] = "Natalia";
        Equipo[1] = "Aldo";
        Equipo[2] = "Ailen";
        Equipo[3] = "Emilia";
        Equipo[4] = "Lucia";
        Equipo[5] = "Sergio";
        Equipo[6] = "Marcelo";
        Equipo[7] = "Humberto";
        Equipo[8] = "Maria";
         
        System.out.println("En la pocicion: " + i + " esta el nombre: " +Equipo[i]);
     }
     
     }
 }
    

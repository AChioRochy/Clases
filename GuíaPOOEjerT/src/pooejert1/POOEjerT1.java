/*
 * De la guía teoríca.
 */

package pooejert1;

import Entidad.Persona;
import java.util.Scanner;

/**
 *
 * @author ailen
 */

public class POOEjerT1 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
         
        Persona obj = new Persona("Rocío", 31, "Castellano");
             
        //System.out.println("Ella es "+ p1.nombre + ", tiene " + p1.edad + " años y habla " + p1.idioma + ".");       
        
        obj.setNombre("Claudia");
        obj.setEdad(40);
        obj.setIdioma("Italiano");
                
        obj.crearPersona();
            
    }
    
}

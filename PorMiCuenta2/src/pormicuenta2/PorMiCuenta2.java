/*
 * 
 * 
 * 
 */

package pormicuenta2;

import Entidades.Mascotas;
import Servicios.MascotasServicios;
import java.util.Scanner;

/**
 *
 * @author ailen
 */

public class PorMiCuenta2 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Mascotas pet = new Mascotas();
        MascotasServicios sv = new MascotasServicios();
        
        System.out.println(" ¡Bienvenido al sistema de HappyPets! Ingrese la cantidad de mascotas que tenga. ");
        int cantidad = leer.nextInt();
        System.out.println("Muy bien, ahora debe llenar el formulario de incripción.");
        pet.crearMascotas();
        System.out.println("Terminado, sus mascotas estan registradas ahora.");
        
    }
    
}

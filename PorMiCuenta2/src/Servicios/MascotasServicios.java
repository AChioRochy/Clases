/*
 * 
 * 
 * 
 */

package Servicios;

import Entidades.Mascotas;
import java.util.Scanner;

/**
 *
 * @author ailen
 */

public class MascotasServicios {
    
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Mascotas pet = new Mascotas();

    public MascotasServicios(String name, int edad, String especie, String raza) {
    }

    public MascotasServicios() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
       
    public MascotasServicios crearMascotas(String name, int edad, String especie, String raza) {

        System.out.println("Ingrese la especie de su mascota.");
        especie = leer.next();
        
        System.out.println("Ingrese la raza de su mascota.");
        raza = leer.next();

        System.out.println("Ingrese la edad de su mascota.");
        edad = leer.nextInt();

        System.out.println("Ingrese el nombre de su mascota.");
        name = leer.next();

        return new MascotasServicios(name, edad, especie, raza);
    }
    
    
    
}

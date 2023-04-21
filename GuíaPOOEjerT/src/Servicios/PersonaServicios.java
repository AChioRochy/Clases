/*
 * Guía 6, teoría; Crea un método void que reciba un objeto tipo persona como parámetro y
 * utilice el get para mostrar sus atributos. Llama ese método desde el main.
 */

package Servicios;

import Entidad.Persona;

/**
 *
 * @author ailen
 */

public class PersonaServicios {
    
    public void crearPersna(String nombre, int edad, String idioma) {
        
        Persona obj = new Persona(nombre,edad,idioma);
        
        System.out.println("Ella es "+ obj.getNombre() + ", tiene " + obj.getEdad() + " años y habla " + obj.getIdioma() + ".");
    
    }
    
}

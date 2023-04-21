/*
 * De la guía teoríca.
 */

package Entidad;

/**
 *
 * @author ailen
 */

public class Persona {
    
    private String nombre;
    private int edad;
    private String idioma;
    
    public Persona(String nombre, int edad, String idioma) {
        this.nombre = nombre;
        this.edad = edad;
        this.idioma = idioma;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
     public void setEdad(int edad) {
        this.edad = edad;
    }
     public void setIdioma(String idioma) {
        this.idioma = idioma;
    }
     
    public String getNombre() {
        return nombre;
    }
     
     public int getEdad() {
        return edad;
    }
     
      public String getIdioma() {
        return idioma;
    }

    public void crearPersona() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

/*
 * 
 * 
 * 
 */

package Entidades;

/**
 *
 * @author ailen
 */

public class Mascotas {
    
    private String name;
    private int edad;
    private String especie;
    private String raza;

    public Mascotas() {
    }

    public Mascotas(String name, int edad, String especie, String raza) {
        this.name = name;
        this.edad = edad;
        this.especie = especie;
        this.raza = raza;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public void crearMascotas() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
        
}

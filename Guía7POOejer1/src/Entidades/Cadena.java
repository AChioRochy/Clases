/*
Realizar una clase llamada Cadena, que tenga como atributos una frase y su longitud. 
Agregar un constructor vacío y uno solamente con atributo frase. 
Agregar getters y setters. 
El constructor con frase como atributo debe settear la longitud de la frase de manera automática. 
*/

package Entidades;

/**
 *
 * @author ailen
 */

public class Cadena {
    
    // Atributos
    private String frase;
    private String nuevaFrase;
    private int longitud;
    private int longNuevaFrase;

    // Constructores, L debe settear la longitud de la frase de manera automática
    public Cadena() {
    }
    
    public Cadena(String frase, String nuevaFrase) {
        this.frase = frase;  
        this.nuevaFrase = nuevaFrase;
        this.longitud = frase.length();
        this.longitud = nuevaFrase.length();
    }

    // Get and Set 
    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
        this.longitud = frase.length();
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public String getNuevaFrase() {
        return nuevaFrase;
    }

    public void setNuevaFrase(String nuevaFrase) {
        this.nuevaFrase = nuevaFrase;
    }

    public int getLongNuevaFrase() {
        return longNuevaFrase;
    }

    public void setLongNuevaFrase(int longNuevaFrase) {
        this.longNuevaFrase = longNuevaFrase;
    }
    
}

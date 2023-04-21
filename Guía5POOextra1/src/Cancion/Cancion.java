/*
Desarrollar una clase Cancion con los siguientes atributos: título y autor.
Se deberá definir además dos constructores: uno vacío que inicializa el
título y el autor a cadenas vacías y otro que reciba como parámetros el
título y el autor de la canción. Se deberán además definir los métodos
getters y setters correspondientes.
*/

package Cancion;

import java.util.Scanner;

/**
 *
 * @author ailen
 */

public class Cancion {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    private String titulo;
    private String autor;
    
    public Cancion() {
    }
   
    public Cancion(String titulo, String autor) {
    this.titulo = titulo;
    this.autor = autor;
    }
    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    public void setAutor(String autor) {
        this.autor = autor;
    }
    
    public String getTitulo() {
        return titulo;
    }
    
    public String getAutor() {
        return autor;
    }
    
}

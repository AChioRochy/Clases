/*
Desarrollar una clase Cancion con los siguientes atributos: título y autor.
Se deberá definir además dos constructores: uno vacío que inicializa el
título y el autor a cadenas vacías y otro que reciba como parámetros el
título y el autor de la canción. Se deberán además definir los métodos
getters y setters correspondientes.
*/

package guíapooextra1;

import Cancion.Cancion;

/**
 *
 * @author ailen
 */

public class GuíaPOOextra1 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        
        Cancion song1 = new Cancion();
        
        //System.out.println("La canción se llama "+ song1.titulo + " y su autor es " + song1.autor + ".");       
        
        song1.setTitulo("Noches de Tormenta");
        song1.setAutor("Vincent Gaunt");
        
        System.out.println("La canción se llama "+ song1.getTitulo() + " y su autor es " + song1.getAutor() + ".");
        
    }

}

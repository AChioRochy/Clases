/*
Crear una clase llamada Libro que contenga los siguientes atributos:
ISBN, Título, Autor, Número de páginas, y un constructor con todos los
atributos pasados por parámetro y un constructor vacío. Crear un
método para cargar un libro pidiendo los datos al usuario y luego
informar mediante otro método el número de ISBN, el título, el autor del
libro y el número de páginas.
*/

package guíapooej1;

import Libro.Libro;

/**
 *
 * @author ailen
 */

public class GuíaPOOej1 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
              
        Libro book1 = new Libro();
        
        System.out.println("Libro con Constructor Vacío");
        System.out.println(book1.toString());
        
        System.out.println("==========================================");
        
        System.out.println("Libro con Constructor Detallado");
        Libro book2 = new Libro("9781234589712345", "Las Travesuras de Raúl", "Raquel Fuentes", 581);
        System.out.println(book2);
        
        System.out.println("==========================================");
        
        System.out.println("Libro con Constructor Modificado");
        book1.cargarLibro();
        
        System.out.println("==========================================");
        
        System.out.println("Datos Almacenados en la Nube");
        System.out.println();
        System.out.println("El primer libro quedo así: " + book2);
        System.out.println("El segundo libro quedo así: " + book1);
        
        System.out.println("==========================================");
    }
    
}

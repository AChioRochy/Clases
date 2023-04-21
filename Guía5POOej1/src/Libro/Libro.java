/*
Crear una clase llamada Libro que contenga los siguientes atributos:
ISBN, Título, Autor, Número de páginas, y un constructor con todos los
atributos pasados por parámetro y un constructor vacío. Crear un
método para cargar un libro pidiendo los datos al usuario y luego
informar mediante otro método el número de ISBN, el título, el autor del
libro y el número de páginas.
*/

package Libro;

import java.util.Scanner;

/**
 *
 * @author ailen
 */

public class Libro {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public String ISBN;
    public String titulo;
    public String autor;
    public int paginas;
    
    public Libro() {
        
    }
    
    public Libro(String ISBN, String titulo, String autor, int paginas) {
        
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
       
    }
    
   public void cargarLibro() {
       
       System.out.println("Ingrese el ISBN: ");
        ISBN = leer.next();
        // ISBN = 3459781234589712
        System.out.println("Ingrese el titulo: ");
        titulo = leer.next();
        // titulo = El Cementerio de Valle Oscuro
        System.out.println("Ingrese la autora: ");
        autor = leer.next();
        // autora = Cassandra Ravignani
        System.out.println("Ingrese la cantidad de paginas: ");
        paginas = leer.nextInt();
        // paginas = 824
       
       
   }
    
   @Override
    public String toString() {
        
        return "Libro: El ISBN es " + ISBN + ", el título es " + titulo + ", la autora es " + autor + " y la cantidad de paginas es " + paginas + ".";
    
        /* 
        ISBN (9781234589712345)
        Titulo "Las Travesuras de Raúl" 
        Autor "Raquel Fuentes" 
        Paginas (518) 
        */

    }
    
    
}

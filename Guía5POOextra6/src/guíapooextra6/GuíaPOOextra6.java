/*
Crea una clase "Rectángulo" que tenga atributos "lado1" y "lado2" y un
método "calcular_area" que calcule y devuelva el área del rectángulo.
Luego crea un objeto "rectangulo1" de la clase "Rectángulo" con lados
de 4 y 6 y imprime el área del rectángulo.
*/

package guíapooextra6;

import Entidades.Rectang;

/**
 *
 * @author ailen
 */

public class GuíaPOOextra6 {
   
    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        
        Rectang obj = new Rectang();
        System.out.println("");
        
        System.out.println("El área del rectángulo de ejemplo es " + obj.calArea() ); 
        System.out.println("");
        
        System.out.println("El área del rectángulo 1 es " + obj.calAr() );
        System.out.println("");
        
       }
    
}
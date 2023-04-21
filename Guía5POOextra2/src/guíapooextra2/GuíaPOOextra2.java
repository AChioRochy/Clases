/*
Definir una clase llamada Puntos que contendrá las coordenadas de dos
puntos, sus atributos serán, x1, y1, x2, y2, siendo cada x e y un punto.
Generar un objeto puntos usando un método crearPuntos() que le pide al
usuario los dos números y los ingresa en los atributos del objeto.
Después, a través de otro método calcular y devolver la distancia que
existe entre los dos puntos que existen en la clase Puntos. 
*/

package guíapooextra2;

import Puntos.Puntos;

/**
 *
 * @author ailen
 */

public class GuíaPOOextra2 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        
        Puntos tejido = new Puntos(12,15,12,16);
        
        System.out.println(tejido.getX1());
        
        tejido.crearPuntos();
        
        System.out.println("La distancia entre los dos puntos es: "+ tejido.calcDistancia());
        
    }

}
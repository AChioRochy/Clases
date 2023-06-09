/* Declarar una clase llamada Circunferencia que tenga como atributo
 * privado el radio de tipo real. A continuación, se deben crear los
 * siguientes métodos:
  * a) Método constructor que inicialice el radio pasado como parámetro.
  * b) Métodos get y set para el atributo radio de la clase Circunferencia.
  * c) Método para crearCircunferencia(): que le pide el radio y lo guarda
      en el atributo del objeto.
  * d) Método area(): para calcular el área de la circunferencia (Area=〖
      π*radio〗^2).
  * e) Método perimetro(): para calcular el perímetro
      (Perimetro=2*π*radio).
 */

package guíapooej2;

import Circunferencia.Circunferencia;

/**
 *
 * @author ailen
 */

public class GuíaPOOej2 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        
        Circunferencia c1 = new Circunferencia();
        
        System.out.println("");
        
        c1.cargarCircun();
                
        System.out.println(c1.calcularArea());
        
        System.out.println(c1.calcularPerim());
        
        System.out.println("");
    }
    
}

/*              Método Static y Clase Math

Realizar una clase llamada ParDeNumeros que tenga como atributos dos
números reales con los cuales se realizarán diferentes operaciones
matemáticas. La clase debe tener un constructor vacío, getters y setters.
En el constructor vacío se usará el Math.random para generar los dos
números.

Crear una clase ParDeNumerosService, en el paquete
Servicios, que deberá además implementar los siguientes métodos:

a) Método mostrarValores que muestra cuáles son los dos números
guardados.

b) Método devolverMayor para retornar cuál de los dos atributos tiene
el mayor valor

c) Método calcularPotencia para calcular la potencia del mayor valor de
la clase elevado al menor número. Previamente se deben redondear
ambos valores.

d) Método calculaRaiz, para calcular la raíz cuadrada del menor de los
dos valores. Antes de calcular la raíz cuadrada se debe obtener el
valor absoluto del número.

*/

package Servicios;

import Entidades.ParDeNumeros;

/**
 *
 * @author ailen
 */

public class ParDeNumerosServicios {
    
    ParDeNumeros numbers = new ParDeNumeros();
    
    public void mostrarValores() {
              
        System.out.println("El primer valor es: " + numbers.getN1());
        System.out.println("El segundo valor es: " + numbers.getN2());
        
    }
    
    public void devolverMayor() {
                
        if(numbers.getN1() > numbers.getN2()) {
          System.out.println("El valor mayor es: " + numbers.getN1());
        } else if (numbers.getN2() > numbers.getN1()) {
          System.out.println("El valor mayor es: " + numbers.getN2());
        } else {
          System.out.println("Los dos números son iguales.");
        }
    }
    
    public double calcularPotencia() {
        
        double base, exponente;
        
        if (numbers.getN1() > numbers.getN2()) {
            base = Math.round(numbers.getN1());
            exponente = Math.round(numbers.getN2());
        } else {
            base = Math.round(numbers.getN2());
            exponente = Math.round(numbers.getN1());
        }
        
        return Math.pow(base,exponente);
    }

    public double calcularRaiz() {
        
        double menor;
        
        if (numbers.getN1() < numbers.getN2()) {
            menor = Math.abs(numbers.getN1());
        } else {
            menor = Math.abs(numbers.getN2());
        }
        
        return Math.round(menor);
    }
}

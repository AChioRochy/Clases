/*

* Realizar una clase llamada Persona en el paquete de entidades que
tengan los siguientes atributos: nombre, edad, sexo, peso y altura. 
Si desea añadir algún otro atributo, puede hacerlo. 
Agregar constructores, getters y setters.

* En el paquete Servicios crear PersonaServicio con los siguientes 3
métodos:
    a) Método esMayorDeEdad(): indica si la persona es mayor de edad. La
función devuelve un booleano.
    b) Metodo crearPersona(): el método crear persona, le pide los valores
de los atributos al usuario y después se le asignan a sus respectivos
atributos para llenar el objeto Persona. 
    c) Método calcularIMC(): calculara si la persona está en su peso ideal
(peso en kg/(altura^2 en mt2)). Si esta fórmula da por resultado un
valor menor que 20, significa que la persona está por debajo de su
peso ideal y la función devuelve un -1. Si la fórmula da por resultado
un número entre 20 y 25 (incluidos), significa que la persona está en
su peso ideal y la función devuelve un 0. Finalmente, si el resultado
de la fórmula es un valor mayor que 25 significa que la persona tiene
sobrepeso, y la función devuelve un 1.

* A continuación, en la clase main hacer lo siguiente:
   ● Crear 4 objetos de tipo Persona con distintos valores, a continuación,
llamaremos todos los métodos para cada objeto, deberá comprobar si la
persona está en su peso ideal, tiene sobrepeso o está por debajo de su
peso ideal e indicar para cada objeto si la persona es mayor de edad.
   ● Por último, guardaremos los resultados de los métodos calcularIMC y
esMayorDeEdad en distintas variables(arrays), para después calcular un
porcentaje de esas 4 personas cuantas están por debajo de su peso,
cuantas en su peso ideal y cuantos, por encima, y también calcularemos
un porcentaje de cuantos son mayores de edad y cuantos menores. Para
esto, podemos crear unos métodos adicionales.

*/

package guia6pooejer3;

import Entidades.Persona;
import Servicios.PersonaServicios;

/**
 *
 * @author ailen
 */

public class Guia6POOejer3 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        
        PersonaServicios PersonaServicios = new PersonaServicios();
        Persona[] personas = new Persona[4];
        
        int[] resultadosIMC = new int[4];
        boolean[] mayoresDeEdad = new boolean[4];

        for (int i = 0; i < 4; i++) {
            personas[i] = PersonaServicios.crearPersona();
            resultadosIMC[i] = PersonaServicios.calcularIMC(personas[i]);
            mayoresDeEdad[i] = PersonaServicios.esMayorDeEdad(personas[i]);
        }

        int porDebajoPeso = 0;
        int enPesoIdeal = 0;
        int conSobrepeso = 0;
        int cantidadMayoresDeEdad = 0;

        for (int i = 0; i < 4; i++) {
            switch (resultadosIMC[i]) {
                case -1:
                    porDebajoPeso++;
                    break;
                case 0:
                    enPesoIdeal++;
                    break;
                default:
                    conSobrepeso++;
                    break;
            }

            if (mayoresDeEdad[i]) {
                cantidadMayoresDeEdad++;
            }
        }

        System.out.printf("Porcentaje de personas por debajo del peso ideal: %.2f%%\n", (porDebajoPeso / 4.0) * 100);
        System.out.printf("Porcentaje de personas en su peso ideal: %.2f%%\n", (enPesoIdeal / 4.0) * 100);
        System.out.printf("Porcentaje de personas con sobrepeso: %.2f%%\n", (conSobrepeso / 4.0) * 100);
        System.out.printf("Porcentaje de personas mayores de edad: %.2f%%\n", (cantidadMayoresDeEdad / 4.0) * 100);
        System.out.printf("Porcentaje de personas menores de edad: %.2f%%\n", ((4 - cantidadMayoresDeEdad) / 4.0) * 100);
    }
    
}

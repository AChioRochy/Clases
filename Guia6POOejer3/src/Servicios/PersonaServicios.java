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

package Servicios;

import Entidades.Persona;
import java.util.Scanner;

/**
 *
 * @author ailen
 */

public class PersonaServicios {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    // b) Metodo crearPersona()
    public Persona crearPersona(String nombre, int edad, String sexo, double peso, double altura) {
        
        System.out.println("Por favor, ingrese su nombre");
        nombre = leer.next();
        System.out.println("Ahora, ingrese su edad");
        edad = leer.nextInt();
        System.out.println("Indique su sexo, por favor; siendo F para femenino, M para masculino e I para indefinido.");
        sexo = leer.next();
        
        while (!"F".equals(sexo) && !"M".equals(sexo) && !"I".equals(sexo)) {
            System.out.println("Sexo inválido, vuelva a introducirlo.");
            sexo = leer.next();
        }
        
        System.out.println(" Ahora introdusca su peso (en kg) ");
        peso = leer.nextDouble();
        System.out.println(" Y, por último, su altura (en metros) ");
        altura = leer.nextDouble();
        
        return new Persona(nombre, edad, sexo, peso, altura);
    }

    // a) Método esMayorDeEdad() -Verdadero/Falso-
    public boolean esMayorDeEdad(int edad) {
        return edad >= 18;
    }

    // c) Método calcularIMC() 
    public int calcularIMC(String nombre, double peso, double altura) {
        double IMC = peso / (altura * altura);

        if (IMC <= 20) {
            System.out.println(nombre + " está bajo de peso.");
            return -1;
        } 
        else if (IMC >= 20 && IMC <= 25) {
            System.out.println(nombre + " está en su peso ideal.");
            return 0;
        } 
        else {
            System.out.println(nombre + " está en sobrepeso.");
            return 1;
        }
    }
    
    
    public static Persona crearPersona() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static int calcularIMC(Persona persona) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
    
}
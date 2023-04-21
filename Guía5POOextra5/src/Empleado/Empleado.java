/*
Crea una clase "Empleado" que tenga atributos como "nombre", "edad" y
"salario". Luego, crea un método "calcular_aumento" que calcule el
aumento salarial de un empleado en función de su edad y salario actual.
El aumento salarial debe ser del 10% si el empleado tiene más de 30
años o del 5% si tiene menos de 30 años.
*/

package Empleado;

import java.util.Scanner;

/**
 *
 * @author ailen
 */

public class Empleado {
    
    private String nombre;
    private int edad;
    private int salario;
    
    public Empleado() {
    }
    
    public Empleado(String nombre, int edad, int salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;        
                        
    }
    
    public void calcularAumento() {
        
        Scanner leer = new Scanner(System.in);
        
        double aumento;
        
        System.out.println("Empleado, por favor, ingrese su nombre");
        nombre = leer.next();
        
        System.out.println(nombre + ", ingrese su edad.");
        edad = leer.nextInt();
        
        System.out.println(nombre + ", ingrese su sueldo actual.");
        salario = leer.nextInt();
        
        if (edad >= 30) {
          aumento = salario + ((salario * 10) /100);
        }
        else {
            aumento = salario + ((salario * 5) / 100);
        }
        
        System.out.println(nombre + ", su aumento salarial es $" + aumento);
        
    }
    
}

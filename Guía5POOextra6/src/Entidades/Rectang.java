/*
Crea una clase "Rectángulo" que tenga atributos "lado1" y "lado2" y un
método "calcular_area" que calcule y devuelva el área del rectángulo (largo * ancho).
Luego crea un objeto "rectangulo1" de la clase "Rectángulo" con lados
de 4 y 6 y imprime el área del rectángulo.
*/

package Entidades;

import java.util.Scanner;

/**
 *
 * @author ailen
 */

public class Rectang {
    
    Scanner leer = new Scanner(System.in);
    
    private int lado1;
    private int lado2;
    
    public Rectang () {
    }
    
    public Rectang (int lado1, int lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }
    
    public int calArea () {
        System.out.println("Por favor, ingrese el valor del largo");
        int largo = leer.nextInt();
        System.out.println("Por favor, ingrese el valor del ancho");
        int ancho = leer.nextInt();
        int a = largo * ancho;
        return a;
    }
    
    public int calAr () {
        int lado1 = 4;
        int lado2 = 6;
        int ar = lado1 * lado2;
        return ar;  
    }    
    
}

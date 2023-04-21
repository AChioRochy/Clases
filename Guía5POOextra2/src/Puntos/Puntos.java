/*
Definir una clase llamada Puntos que contendrá las coordenadas de dos
puntos, sus atributos serán, x1, y1, x2, y2, siendo cada x e y un punto.
Generar un objeto puntos usando un método crearPuntos() que le pide al
usuario los dos números y los ingresa en los atributos del objeto.
Después, a través de otro método calcular y devolver la distancia que
existe entre los dos puntos que existen en la clase Puntos. 
*/

package Puntos;

import java.util.Scanner;

/**
 *
 * @author ailen
 */

public class Puntos {
    
    private int x1,x2,y1,y2;
    
    public Puntos() {
    }
    
    public Puntos(int x1, int x2, int y1, int y2) {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }
    
    public void crearPuntos(){
        
    Scanner sc = new Scanner(System.in).useDelimiter("\n");
    
    System.out.println("Ingrese valor en la coordenada de x para el primer punto:");
    x1 = sc.nextInt();
    System.out.println("Ingrese valor en la coordenada de y para el primer punto:");
    y1 = sc.nextInt();
    System.out.println("Ingrese valor en la coordenada de x para el segundo punto:");
    x2 = sc.nextInt();
    System.out.println("Ingrese valor en la coordenada de y para el segundo punto:");
    y2 = sc.nextInt();
    }
    
    public double calcDistancia(){
     double resultado = Math.sqrt(Math.pow(x2-x1, 2)+Math.pow(y2-y1, 2)); 
     return resultado;
    }

    public int getX1() {
        return x1;
    }
    
        
}

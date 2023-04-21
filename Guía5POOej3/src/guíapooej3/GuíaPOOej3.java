/* Crear una clase llamada Operacion que tenga como atributos privados
   numero1 y numero2. A continuación, se deben crear los siguientes
   métodos:

   a) Método constructor con todos los atributos pasados por parámetro.
   b) Método constructor sin los atributos pasados por parámetro.
   c) Métodos get y set.
   d) Método para crearOperacion(): que le pide al usuario los dos
   números y los guarda en los atributos del objeto.
   e) Método sumar(): calcular la suma de los números y devolver el
   resultado al main.
   f) Método restar(): calcular la resta de los números y devolver el
   resultado al main
   g) Método multiplicar(): primero valida que no se haga una
   multiplicación por cero, si fuera a multiplicar por cero, el método
   devuelve 0 y se le informa al usuario el error. Si no, se hace la
   multiplicación y se devuelve el resultado al main
   h) Método dividir(): primero valida que no se haga una división por cero,
   si fuera a pasar una división por cero, el método devuelve 0 y se le
   informa al usuario el error se le informa al usuario. Si no, se hace la
   división y se devuelve el resultado al main.
  */

package guíapooej3;

import Operacion.Operacion;
import java.util.Scanner;

/**
 *
 * @author ailen
 */

public class GuíaPOOej3 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        Operacion mates = new Operacion();
        
        // System.out.println("==========================================");
        
        // System.out.println(" Parte 1 del ejercicio: constructores genéricos, por parámetros, get y set. ");
        
        // System.out.println( "Los valores son " + mates.n1 + " y " + mates.n2 + "." );
        
        // mates.setN1(5);
        // mates.setN2(7);
        
        // System.out.println("Los valores son " + mates.getN1() + " , " + mates.getN2() + "." );
        
        // System.out.println("==========================================");
        
       // System.out.println(" Parte 2 del ejercicio: cargar operador. ");
        
       // mates.cargarOperador();
                
        System.out.println("==========================================");
        
        System.out.println(" Calculadora con Métodos ");
        
        System.out.println("");
        
        System.out.println("Sumar");
        mates.sum();
        System.out.println("Restar");
        mates.rest();
        System.out.println("Múltiplicar");
        mates.multi();
        System.out.println("Dividir");
        mates.div();
        
        System.out.println("");
       
        System.out.println("==========================================");
        
        System.out.println("");
    }
    
}

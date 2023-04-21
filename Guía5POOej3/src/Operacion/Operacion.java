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

package Operacion;

import java.util.Scanner;

/**
 *
 * @author ailen
 */

public class Operacion {
    
    Scanner leer = new Scanner(System.in);
    
    private int n1;
    private int n2;
        
    public Operacion() {
        
    }
    
    public Operacion(int n1, int n2) {
        this.n1 = n1;
        this.n2 = n2;
        
    }
    
    public void setN1(int n1) {
        this.n1 = n1;
    }
    
    public void setN2(int n2) {
        this.n2 = n2;
    }
    
    public double getN1(int n1) {
        return n1;
    }
    
    public double getN2(int n2) {
        return n2;
    }
    
    public void cargarOperador() {
        
        System.out.println("Ingrese dos valores enteros");
        
        int n1 = leer.nextInt();
        int n2 = leer.nextInt();
        
        System.out.println("Los numeros son " + n1 + ", " + n2);
        
    }
    
    public void sum() {
        
        int n1 = leer.nextInt();
        int n2 = leer.nextInt();
        int s = n1 + n2;
        System.out.println("La suma de los valores es " + s);   
        
    }
    
     public void rest() {
        
        int n1 = leer.nextInt();
        int n2 = leer.nextInt();
        int r = n1 - n2;
        System.out.println("La resta de los valores es " + r);   
        
    }
     
     public void multi () {
             
             int n1 = leer.nextInt();
             int n2 = leer.nextInt();
             
             if (n1 == 0 || n2 == 0) {
                 System.out.println("¡Error! El cero no es valido.");
                 int error = 0;
                 System.out.println(error);
                 
                } else {
                int m = n1 * n2;
                 System.out.println("La multiplicación de los valores es " + m);
                }     
            }
     
     public void div () {
             
             int n1 = leer.nextInt();
             int n2 = leer.nextInt();
             
             if (n1 == 0 || n2 == 0) {
                 System.out.println("¡Error! El cero no es valido.");
                 int error = 0;
                 System.out.println(error);
                 
                } else {
                int d = n1 / n2;
                 System.out.println("La división de los valores es " + d);
                }     
            }      
     
}

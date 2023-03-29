/*
*Crea una aplicación que le pida dos números al usuario y este pueda
*elegir entre sumar, restar, multiplicar y dividir. La aplicación debe tener
*una función para cada operación matemática y deben devolver sus
*resultados para imprimirlos en el main.
*/
package guia.pkg4;

import java.util.Scanner;

/**
 *
 * @author ailen
 */
public class Ejer1 {
    public static void main(String[] args) {
       
        Scanner leer = new Scanner(System.in);
        int opcion;       
        System.out.println("Ingrese dos números por favor");
        int n1 = leer.nextInt();
        int n2 = leer.nextInt(); 
        
        System.out.println("===================================");
        
         do {
            System.out.println("MENU");
            System.out.println("");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.println("");
            System.out.println("Elija una opcion:");
            
        System.out.println("===================================");
            
            opcion = leer.nextInt();
            
            switch (opcion) {
               
                case 1:
                System.out.println("==============================");
                System.out.println("");
                int res1 = suma(n1,n2);
                System.out.println("La suma de los valores es "+ res1);
                System.out.println("");
                System.out.println("==============================");
                break;
                
                case 2:
                System.out.println("==============================");
                System.out.println("");
                int res2 = resta(n1,n2);
                System.out.println("La resta de los valores es "+ res2);
                System.out.println("");
                System.out.println("==============================");
                break;
                
                case 3:
                System.out.println("==============================");
                System.out.println("");
                int res3 = multi(n1,n2);
                System.out.println("La multiplicación de los valores es "+ res3);
                System.out.println("");
                System.out.println("==============================");
                break;
                
                case 4:
                System.out.println("==============================");
                System.out.println("");
                int res4 = div(n1,n2);
                System.out.println("La división de los valores es "+ res4);
                System.out.println("");
                System.out.println("==============================");
                break;
                
                case 5:
                System.out.println("==============================");
                System.out.println("");
                System.out.println("Saliendo, gracias");
                System.out.println("");
                System.out.println("==============================");
                break;
              }
            
        } while (opcion !=5);            
        
            System.out.println("==============================");
            
            System.out.println("Elija una opción");
            
            System.out.println("==============================");
            }
 
public static int suma(int n1, int n2) {

int n3 = n1 + n2;
return n3;

}

public static int resta(int n1, int n2) {

int n3 = n1 - n2;
return n3;

}

public static int multi(int n1, int n2) {

int n3 = n1 * n2;
return n3;

}

public static int div(int n1, int n2) {

int n3 = n1 / n2;
return n3;

}
}
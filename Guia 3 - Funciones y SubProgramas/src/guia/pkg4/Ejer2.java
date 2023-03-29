/*
*Diseñe una función que pida el nombre y la edad de N personas e
*imprima los datos de las personas ingresadas por teclado e indique si
*son mayores o menores de edad. Después de cada persona, el programa
*debe preguntarle al usuario si quiere seguir mostrando personas y frenar
*cuando el usuario ingrese la palabra “No”.
*/
package guia.pkg4;

import java.util.Scanner;

/**
 *
 * @author ailen
 */
public class Ejer2 {
  public static void main(String[] args) {
       
        Scanner leer = new Scanner(System.in);
        int edad;
        String  nombre , opcion;

    do {
      System.out.println( "Dime tu nombre" );
      nombre = leer.next();

      System.out.println( "Dime tu edad" );
      edad = leer.nextInt ();

      if ( esMayorDeEdad ( edad )) {
        System.out.println( nombre + ": Es mayor de edad." );
      } else {
        System.out.println( nombre + ": Es menor de edad." );
      }

      System.out.println( "¿Desea continuar? (Si/No) " );
      opcion = leer.next();
      
    } while (! opcion.equalsIgnoreCase ( "No" ));
    
  }

  public  static  boolean  esMayorDeEdad ( int  edad ) {
    return  edad >= 18 ;
  }
}

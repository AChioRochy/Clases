/*
*Crea una aplicación que a través de una función nos convierta una
*cantidad de euros introducida por teclado a otra moneda, estas pueden
*ser a dólares, yenes o libras. La función tendrá como parámetros, la
*cantidad de euros y la moneda a convertir que será una cadena, este no
*devolverá ningún valor y mostrará un mensaje indicando el cambio
*(void).
*/
package guia.pkg4;

import java.util.Scanner;

/**
 *
 * @author ailen
 */
public class Ejer3 {
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    int euros = 0;
    String moneda = "";
    cambio(euros, moneda);
    }
  
    public static void cambio(int euro, String moneda){
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingresa la cantidad de a convertir");
        euro = leer.nextInt();
        
        System.out.println(         "Seleccione una divisa"           );
        System.out.println("=========================================");
        System.out.println(                 "1- Libra"                );
        System.out.println(                 "2- Dolar"                );
        System.out.println(                 "3- Yen"                  );    
        System.out.println("=========================================");
        
        moneda = leer.next();
        
        switch (moneda){
              case "Libra":
                  System.out.println("Los euros equivalen a " + euro * 0.86 + "libras");
                  break;
              case  "Dolar":
                  System.out.println("Los euros son equivalentes a " + euro * 1.28611 + "dolares");
                  break;
              case "Yen":
                  System.out.println("Los euros son equivalentes a " + euro * 129.852 + "yenes");
          break;
     }
  } 
}

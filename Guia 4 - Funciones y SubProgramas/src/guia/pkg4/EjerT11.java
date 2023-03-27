/*
*Escribir un programa que procese una secuencia de caracteres ingresada por
*teclado y terminada en punto, y luego codifique la palabra o frase ingresada de
*la siguiente manera: cada vocal se reemplaza por el carácter que se indica en
*la tabla y el resto de los caracteres (incluyendo a las vocales acentuadas) se
*mantienen sin cambios.
*
*Realice un subprograma que reciba una secuencia de caracteres y retorne la
*codificación correspondiente. Utilice la estructura “según” para la
*transformación.
*
*Por ejemplo, si el usuario ingresa: Ayer, lunes, salimos a las once y 10.
*La salida del programa debería ser: @y#r, l*n#s, s@l$m%s @ l@s %nc# y 10.
*/
package guia.pkg4;

import java.util.Scanner;



/**
 *
 * @author ailen
 */
public class EjerT11 {
   public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingresar una frase.");
        String frase = leer.nextLine();
        
        System.out.println(fraseNueva(frase));
   {     

public static String fraseNueva(String frase) {
    String fraseNueva = ""; 
    for (int i = 0; i < frase.length(); i++) {
       char letra = frase.charAt(i);
        
       switch (letra) {
            case "a", "A":
            fraseNueva = fraseNueva.concat("@");
            break;

            case "e", "E":
            fraseNueva = fraseNueva.concat("#");
            break;

            case "i", "I":
            fraseNueva = fraseNueva.concat("$");
            break;

            case "o", "O":
            fraseNueva = fraseNueva.concat("%");
            break;

            case "u", "U":
            fraseNueva = fraseNueva.concat("&");
            break;

            default:
            fraseNueva = fraseNueva.concat(String.valueOf(letra));
            break;
    
        }
    }

    return fraseNueva

}
    


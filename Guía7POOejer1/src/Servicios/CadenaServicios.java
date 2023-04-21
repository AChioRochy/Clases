/*
a) Método mostrarVocales(), deberá contabilizar la cantidad de vocales
que tiene la frase ingresada.

b) Método invertirFrase(), deberá invertir la frase ingresada y mostrarla
por pantalla. 

c) Método vecesRepetido(String letra), recibirá un carácter ingresado
por el usuario y contabilizar cuántas veces se repite el carácter en la
frase.

d) Método compararLongitud(String frase), deberá comparar la longitud
de la frase que compone la clase con otra nueva frase ingresada por
el usuario.

e) Método unirFrases(String frase), deberá unir la frase contenida en la
clase Cadena con una nueva frase ingresada por el usuario y mostrar
la frase resultante.

f) Método reemplazar(String letra), deberá reemplazar todas las letras
“a” que se encuentren en la frase, por algún otro carácter
seleccionado por el usuario y mostrar la frase resultante.

g) Método contiene(String letra), deberá comprobar si la frase contiene
una letra que ingresa el usuario y devuelve verdadero si la contiene y
falso si no.
*/

package Servicios;

import Entidades.Cadena;
import java.util.Scanner;

/**
 *
 * @author ailen
 */

public class CadenaServicios {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    Cadena f = new Cadena();
    
    // Método para mostrar la cantidad de vocales de la frase
    public static void mostrarVocales(Cadena cadena) {
        int cantidadVocales = 0;
        for (int i = 0; i < cadena.getFrase().length(); i++) {
            char letra = cadena.getFrase().charAt(i);
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u' ||
                    letra == 'A' || letra == 'E' || letra == 'I' || letra == 'O' || letra == 'U') {
                cantidadVocales++;
            }
        }
        System.out.println("La cantidad de vocales es: " + cantidadVocales);
    }
    
    // Método para invertir la frase (al reves)
    public static void invertirFrase(Cadena cadena) {
        StringBuilder fraseInvertida = new StringBuilder(cadena.getFrase()).reverse();
        System.out.println("La frase invertida es '" + fraseInvertida + "'.");
    }     
    
    // Método para contar la cantidad de veces que se repite una letra
    public static void vecesRepetido(Cadena cadena, char letra) {
        int cantidadVeces = 0;
        for (int i = 0; i < cadena.getFrase().length(); i++) {
            if (cadena.getFrase().charAt(i) == letra) {
                cantidadVeces++;
            }
        }
        System.out.println("El carácter '" + letra + "' se repite " + cantidadVeces + " veces.");
    }
        
    // Método para comparar la longitud de dos frases
    public static void compararLongitud(Cadena f, String nuevaFrase) {
        int longNF = nuevaFrase.length();    
        if (f.getLongitud() > longNF) {
            System.out.println("La frase '" + f.getFrase() + "' es más larga que la frase ingresada.");
        } else if (f.getLongitud() < longNF) {
            System.out.println("La frase ingresada es más larga que la frase '" + f.getFrase() + "'.");
        } else {
            System.out.println("Las frases tienen la misma longitud.");
        }
    }

    // Método para unir la frase original con una segunda ingresada manuelmente
    public static void unirFrases(Cadena f, String nuevaFrase) {
      String fraseUnida = f.getFrase() + " " + nuevaFrase;
        System.out.println("La frase resultante es '" + fraseUnida + "'.");
    }
    
    // Método para reemplazar la letra "a" con un carácter aleatorio escogido por el usuario
    public static void reemplazar(Cadena f, char letra, char nuevoCaracter) {
        String frase = f.getFrase();
        frase = frase.replace(letra, nuevoCaracter);
        f.setFrase(frase);
        f.setLongitud(frase.length());
        System.out.println("La frase resultante es '" + f.getFrase() + "'.");
    }
       
    // Método para saber si aparece una letra que ingresa el usuario regresando verdadero o falso
    public static boolean contiene(Cadena f, char letra) {
        boolean result = f.getFrase().contains(Character.toString(letra));
        if (result) {
        System.out.println("La letra " + letra + " se encuentra en la frase.");
    } else {
        System.out.println("La letra " + letra + " no se encuentra en la frase.");
    }
      return result;
    }
}

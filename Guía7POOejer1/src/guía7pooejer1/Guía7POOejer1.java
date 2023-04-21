/*

Realizar una clase llamada Cadena, en el paquete de entidades, que
tenga como atributos una frase (String) y su longitud. Agregar
constructor vacío y con atributo frase solamente. Agregar getters y
setters. El constructor con frase como atributo debe setear la longitud
de la frase de manera automática. 

Crear una clase CadenaServicio en el paquete servicios que implemente los siguientes métodos:

a) Método mostrarVocales(), deberá contabilizar la cantidad de vocales
que tiene la frase ingresada.

b) Método invertirFrase(), deberá invertir la frase ingresada y mostrarla
por pantalla. Por ejemplo: Entrada: "casa blanca", Salida: "acnalb
asac".

c) Método vecesRepetido(String letra), recibirá un carácter ingresado
por el usuario y contabilizar cuántas veces se repite el carácter en la
frase, por ejemplo:
Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4
veces.

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

package guía7pooejer1;

import Entidades.Cadena;
import Servicios.CadenaServicios;
import java.util.Scanner;

/**
 *
 * @author ailen
 */

public class Guía7POOejer1 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        Cadena f = new Cadena(); // Programando en Java, desde NetBeans
        
        CadenaServicios cdsv = new CadenaServicios(); // y con mis compas de EGG Coorp.
        
        System.out.println("Por favor, ingresa una frase.");
        String frase = leer.next(); 
        
        System.out.println("-----------------------------");
        f.setFrase(frase);
        System.out.println("La frase original es '" + f.getFrase() + "'.");
                
        System.out.println("-----------------------------");
        System.out.println("Y su longitud es de " + f.getLongitud() + " caracteres." );
        
        
        System.out.println("-----------------------------");
        CadenaServicios.mostrarVocales(f);
        System.out.println("-----------------------------");
        CadenaServicios.invertirFrase(f);
        System.out.println("-----------------------------");
        CadenaServicios.vecesRepetido(f, 'a');
        System.out.println("-----------------------------");
        
        System.out.println("Vuelve a ingresar otra frase.");
        String nuevaFrase = leer.next(); 
        
        f.setNuevaFrase(nuevaFrase);
        System.out.println(f.getNuevaFrase());
        System.out.println("-----------------------------");
                
        CadenaServicios.compararLongitud(f, nuevaFrase);
        System.out.println("-----------------------------");
        CadenaServicios.unirFrases(f, nuevaFrase);  
        
        System.out.println("-----------------------------");
        System.out.println(f.getFrase());
        System.out.println("-----------------------------");
                
        System.out.println("Ingrese un caracter para reemplazar las 'a'");
        CadenaServicios.reemplazar(f,'a', leer.next().charAt(0));
        
        System.out.println("-----------------------------");
        f.setFrase("Programando en Java, desde NetBeans");
        
        System.out.println("Ingrese la letra que desea saber si se encuentra en la frase");
        CadenaServicios.contiene(f,leer.next().charAt(0));               
    }
}
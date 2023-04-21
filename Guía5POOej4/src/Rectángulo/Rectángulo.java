/* 
Crear una clase Rectángulo que modele rectángulos por medio de un
atributo privado base y un atributo privado altura. La clase incluirá un
método para crear el rectángulo con los datos del Rectángulo dados por
el usuario. También incluirá un método para calcular la superficie del
rectángulo y un método para calcular el perímetro del rectángulo. Por
último, tendremos un método que dibujará el rectángulo mediante
asteriscos usando la base y la altura. Se deberán además definir los
métodos getters, setters y constructores correspondientes.

Superficie = base * altura / Perímetro = (base + altura) * 2.
*/

package Rectángulo;

import java.util.Scanner;

/**
 *
 * @author ailen
 */

public class Rectángulo {
    
    Scanner leer = new Scanner(System.in);
    
    private int base;
    private int altura;
    
    public void setBase(int base) {
        this.base = base;
    }
   
    public void setAltura(int altura) {
        this.altura = altura;
    }
    
    public int getBase() {
        return base;
    }
    
    public int getAltura() {
        return altura;
    }

    public void crearRectangulo() {
        System.out.println("Ingrese la base");
        this.base = (leer.nextInt());
        System.out.println("Ingrese la altura");
        this.altura = (leer.nextInt());
    }

    public void calcularSuperficie() {
        int superficie = this.base * this.altura;
        System.out.println("La superficie del rectángulo es: " + superficie);
    }

    public void calcularPerimetro() {
        int perimetro = (this.base + this.altura) * 2;
        System.out.println("El perímetro del rectángulo es: " + perimetro);
    }
    
    public void dibujo() {
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < base; j++) {
                if(i==0 || i==(altura-1) || j==0 || j==(base-1)){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }                
            }
            System.out.print('\n');
        }
    }
    
}

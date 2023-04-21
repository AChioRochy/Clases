/*
Crea una clase "Cuenta" que tenga atributos como "saldo" y "titular".
Luego, crea un método "retirar_dinero" que permita retirar una cantidad
de dinero del saldo de la cuenta. Asegúrate de que el saldo nunca sea
negativo después de realizar una transacción de retiro.
*/

package Cuenta;

import java.util.Scanner;

/**
 *
 * @author ailen
 */

public class Cuenta {
    
    private int saldo;
    private String titular;
    
    public Cuenta() {
    }
    
    public Cuenta(String titular, int saldo) {
        this.titular = titular;
        this.saldo = saldo;    
    }
    
    public void retirarDinero() {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Nombre del titular");
        titular = leer.nextLine();
        System.out.println("Su saldo actual es de $250800");
        System.out.println("Ingrese el monto a retirar");
        int monto = leer.nextInt();
        int saldoNuevo;
        
        if (monto <= 250800) {
            saldoNuevo = 250800 - monto;
            System.out.println("Gracias por usar nuestro servicio, su saldo actual es: " + saldoNuevo + ". Y aún es positivo.");
        }
        else {
            System.out.println("Lo siento, el valor es demasiado alto. Por favor, ingrece un monto valído");
            monto = leer.nextInt();
            saldoNuevo = 250800 - monto;
            System.out.println("Gracias por usar nuestro servicio, su saldo actual es: " + saldoNuevo + ". Y aún es positivo.");
        }
        System.out.println("");
    }
    
}

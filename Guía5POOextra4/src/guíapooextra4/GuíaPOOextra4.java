/*
Crea una clase "Cuenta" que tenga atributos como "saldo" y "titular".
Luego, crea un método "retirar_dinero" que permita retirar una cantidad
de dinero del saldo de la cuenta. Asegúrate de que el saldo nunca sea
negativo después de realizar una transacción de retiro.
*/

package guíapooextra4;

import Cuenta.Cuenta;

/**
 *
 * @author ailen
 */

public class GuíaPOOextra4 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        
        Cuenta saldo = new Cuenta();
        
        saldo.retirarDinero();
        
       }
    
}
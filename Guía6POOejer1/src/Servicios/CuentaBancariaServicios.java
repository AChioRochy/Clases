/*
Realizar una clase llamada CuentaBancaria en el paquete Entidades con
los siguientes atributos: numeroCuenta(entero), dniCliente(entero largo),
saldoActual. Agregar constructor vacío, con parámetros, getters y
setters.
Agregar la clase CuentaBancariaServicio en el paquete CuentaBancariaServicios que
contenga:
a) Método para crear cuenta pidiéndole los datos al usuario.
b) Método ingresar(double): recibe una cantidad de dinero a ingresar y
se le sumará al saldo actual.
c) Método retirar(double): recibe una cantidad de dinero a retirar y se le
restara al saldo actual. Si la cuenta no tiene la cantidad de dinero a
retirar se retirará el máximo posible hasta dejar la cuenta en 0.
d) Método extraccionRapida: le permitirá sacar solo un 20% de su saldo.
Validar que el usuario no saque más del 20%.
e) Método consultarSaldo: permitirá consultar el saldo disponible en la
cuenta.
f) Método consultarDatos: permitirá mostrar todos los datos de la
cuenta
*/

package Servicios;

import CuentaBancaria.CuentaBancaria;
import java.util.Scanner;

/**
 *
 * @author ailen
 */

public class CuentaBancariaServicios {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public CuentaBancaria crearCuenta(int numCuenta, long dniCliente, double saldoActual, String nomCliente) {

        System.out.println("Ingresar el número de cuenta");
        numCuenta = leer.nextInt();

        System.out.println("Ingresar el DNI del cliente");
        dniCliente = leer.nextLong();

        System.out.println("Ingresar el saldo actual");
        saldoActual = leer.nextDouble();
        
        System.out.println("Ingresar el nombre del cliente");
        nomCliente = leer.next();

        return new CuentaBancaria(numCuenta, dniCliente, saldoActual, nomCliente);
    }


    public double Ingresar(double saldoActual) {

        System.out.println(" ¿Cuanto dinero quieres ingresar? ");

        double ingresar = leer.nextDouble();
        
        System.out.println(" Su nuevo saldo quedo así: $" + (ingresar + saldoActual));
        
        return ingresar + saldoActual;
    }

    public double Retirar(double saldoActual) {

        System.out.println(" ¿Cúanto dinero quieres retirar? ");

        double retirar = leer.nextDouble();

        if (saldoActual >= retirar) {

            System.out.println(" Se ha retirado $ " + retirar + " de la cuenta.");
        } else {

            saldoActual = 0;
            System.out.println(" No se pudo retir dinero. ");
        }
            return saldoActual - retirar;
    }

    public double Express(double saldoActual) {
        
        System.out.println(" ¿Cúanto dinero quieres retirar? ");
        
        double express = leer.nextDouble();
        
        if (express <= (saldoActual * 0.20)) {
            
          double nuevoSaldo = saldoActual - express;
          
            System.out.println("Extracción rapída realizada, su nuevo saldo es: $" + nuevoSaldo);
            
        }
        else {
            System.out.println(" No es valido el monto, ingrese nueva cantidad. ");
        }
            return express; 
    }

   /* public double consultarSaldo(double saldoActual, double Ingresar, double Retirar, double Express) {
       
       System.out.println("Su saldo sin modificar es: $" + saldoActual);
       System.out.println("Su saldo con ingreso extra es: $" + Ingresar);
       System.out.println("Su saldo con extracción mayor es: $" + Retirar);
       System.out.println("Su saldo con extracción rapída es: $" + Express);
       
       return consultarSaldo;
   } */
   
    public double consultarSaldo(double saldoActual) {
       
       System.out.println("Su saldo actual es: $" + saldoActual);
       
       return saldoActual;
    }
    
    
   public void consultarDatos(int numCuenta, long dniCliente, String nomCliente) {
       
       System.out.println(numCuenta + " es su numero de cuenta.");
       System.out.println(dniCliente + " es su D.N.I registrado.");
       System.out.println(" Y su nombre registrado es: " + nomCliente);
    }
    
}

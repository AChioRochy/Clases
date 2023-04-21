/*
Realizar una clase llamada CuentaBancaria en el paquete Entidades con
los siguientes atributos: numeroCuenta(entero), dniCliente(entero largo),
saldoActual. Agregar constructor vacío, con parámetros, getters y
setters.
Agregar la clase CuentaBancariaServicio en el paquete Servicios que
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

package guía6pooejer1;

import CuentaBancaria.CuentaBancaria;
import Servicios.CuentaBancariaServicios;
import java.util.Scanner;

/**
 *
 * @author ailen
 */

public class Guía6POOejer1 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Bienvenido/a a nuestros servicios bancarios.");

        CuentaBancariaServicios servicios = new CuentaBancariaServicios();

        int opcion = 0;
        double saldoActual = 300100;
        int numCuenta = 987654;
        long dniCliente = 36155972;
        String nomCliente = "Ailen Fontana";

        do {
            System.out.println("Seleccione una opción:");
            System.out.println("1. Crear cuenta");
            System.out.println("2. Consultar saldo");
            System.out.println("3. Consultar datos");
            System.out.println("4. Realizar extracción");
            System.out.println("5. Realizar extracción rápida");
            System.out.println("6. Ingresar nuevo importe");
            System.out.println("7. Salir");

            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Creando cuenta...");
                    CuentaBancaria cuenta = servicios.crearCuenta(numCuenta, dniCliente, saldoActual, nomCliente);
                    System.out.println("Cuenta creada exitosamente: " + cuenta.toString());
                    break;

                case 2:
                    System.out.println("Consultando saldo...");
                    saldoActual = servicios.consultarSaldo(saldoActual);
                    break;

                case 3:
                    System.out.println("Consultando datos...");
                    servicios.consultarDatos(numCuenta, dniCliente, nomCliente);
                    break;

                case 4:
                    System.out.println("Realizando extracción...");
                    saldoActual = servicios.Retirar(saldoActual);
                    break;

                case 5:
                    System.out.println("Realizando extracción rápida...");
                    saldoActual = servicios.Express(saldoActual);
                    break;

                case 6:
                    System.out.println("Ingresando nuevo importe...");
                    saldoActual = servicios.Ingresar(saldoActual);
                    break;

                case 7:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción inválida, seleccione otra opción.");
                    break;
            }

        } while (opcion != 7);

        leer.close();
    }

}

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

package CuentaBancaria;

/**
 *
 * @author ailen
 */

public class CuentaBancaria {
     
    private int numCuenta;
    private long dniCliente;
    private double saldoActual;
    private String nomCliente;
    
    public CuentaBancaria() {
    }
    
    public CuentaBancaria(int numCuenta, long dniCliente, double saldoActual, String nomCliente) {
        this.numCuenta = numCuenta;
        this.dniCliente = dniCliente;
        this.saldoActual = saldoActual;
        this.nomCliente = nomCliente;
    }
    
    public void setNumCuenta(int numCuenta) {
        this.numCuenta = numCuenta;
    }
    public int getNomCuenta() {
        return numCuenta;
    }
    
    public void setDniCliente(long dniCliente) {
        this.dniCliente = dniCliente;
    }
    public long getDniCliente() {
        return dniCliente;
    }
    
    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }
    public double getSaldoActual() {
        return saldoActual;
    }

    public void setNomCliente(String nomCliente) {
        this.nomCliente = nomCliente;
    }

    public String getNomCliente() {
        return nomCliente;
    }
    
}

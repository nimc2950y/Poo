/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectonuevo;

class CuentaCorriente extends Cuenta {
    public double saldo;
    public double  interes = 0.07; // 7%
    public CuentaCorriente(String titular, double saldo) {
        super(titular);
        this.saldo = saldo;
    }
    public void mostrarSaldo() {
        System.out.println("Saldo de la cuenta corriente: $" + saldo);
    }
    public void mostrarTipoInteres() {
        double interesAplicado = saldo * interes;
        System.out.println("Interes aplicado al saldo: $" + interesAplicado);
    }
}
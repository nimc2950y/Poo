/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectonuevo;

/**
 *
 * @author PCENTER
 */
public class ProyectoNuevo {
/*
    public static void main(String[] args) {
        System.out.println("Ejemplo Herencia");
        Perro p = new Perro("Mamifero", "pitbull",31,3);

        p.ladrar();
        p.mostrarEtapaVida();
        p.verificarVacunas();
    }
*/
    
 public static void main(String[] args) {
        // Crear una cuenta de ahorro con datos de ejemplo
        CuentaAhorro ahorro = new CuentaAhorro("Carlitos ", 1000.00);
        ahorro.mostrarTitular();
        ahorro.mostrarSaldo();
        ahorro.mostrarTipoInteres();
        
        CuentaCorriente corriente = new CuentaCorriente("Ana Perez", 1500.00);
        corriente.mostrarTitular();
        corriente.mostrarSaldo();
        corriente.mostrarTipoInteres();
    }
}
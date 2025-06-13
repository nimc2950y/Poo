/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package facturatienda;

/**
 *
 * @author PCENTER
 */
public class Telefono extends Producto {
    public int numeroSIM;

    public Telefono(String nombre, double precio, int numeroSIM) {
        super(nombre, precio);
        this.numeroSIM = numeroSIM;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Numero de SIM: " + numeroSIM);
        System.out.println("-------------------------");
    }
}

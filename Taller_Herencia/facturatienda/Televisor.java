/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package facturatienda;

/**
 *
 * @author PCENTER
 */
public class Televisor extends Producto {
    public int pulgadas;

    public Televisor(String nombre, double precio, int pulgadas) {
        super(nombre, precio);
        this.pulgadas = pulgadas;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Tamaño: " + pulgadas + " pulgadas");
        System.out.println("-------------------------");
    }
}

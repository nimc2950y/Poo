/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package facturatienda;

/**
 *
 * @author PCENTER
 */
public class  Laptop extends Producto {
    public int memoriaRAM;

    public Laptop(String nombre, double precio, int memoriaRAM) {
        super(nombre, precio);
        this.memoriaRAM = memoriaRAM;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Memoria RAM: " + memoriaRAM + " GB");
        System.out.println("-------------------------");
    }
}
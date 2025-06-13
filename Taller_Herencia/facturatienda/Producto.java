/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package facturatienda;

/**
 *
 * @author PCENTER
 */
public class Producto {
    public String nombre;
    public double precio;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public double calcularPrecioConIVA() {
        return precio * 1.12; // 12% IVA
    }

    public void mostrarInformacion() {
        System.out.println("Nombre del producto: " + nombre);
        System.out.println("Precio base: $" + precio);
        System.out.println("Precio con IVA: $" + calcularPrecioConIVA());
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemahotel;

/**
 *
 * @author PCENTER
 */
public class Habitacion {
    public int numeroHabitacion;
    public double precioPorNoche;

    public Habitacion(int numeroHabitacion, double precioPorNoche) {
        this.numeroHabitacion = numeroHabitacion;
        this.precioPorNoche = precioPorNoche;
    }

    public void mostrarInformacion() {
        System.out.println("Habitacion #" + numeroHabitacion);
        System.out.println("Precio por noche: $" + precioPorNoche);
    }
}

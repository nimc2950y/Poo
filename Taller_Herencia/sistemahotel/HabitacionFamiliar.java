/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemahotel;

/**
 *
 * @author PCENTER
 */
public class HabitacionFamiliar extends Habitacion {
    public int capacidadNinos;

    public HabitacionFamiliar(int numeroHabitacion, double precioPorNoche, int capacidadNinos) {
        super(numeroHabitacion, precioPorNoche);
        this.capacidadNinos = capacidadNinos;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Tipo: Familiar");
        System.out.println("Capacidad para niños: " + capacidadNinos);
        System.out.println("--------------------------");
    }
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemahotel;

/**
 *
 * @author PCENTER
 */
public class HabitacionEstandar extends Habitacion {
    public boolean tieneVista;

    public HabitacionEstandar(int numeroHabitacion, double precioPorNoche, boolean tieneVista) {
        super(numeroHabitacion, precioPorNoche);
        this.tieneVista = tieneVista;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Tipo: Estandar");
        System.out.println("Tiene vista: " + (tieneVista ? "Si" : "No"));
        System.out.println("--------------------------");
    }
}
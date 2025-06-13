/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemahotel;

/**
 *
 * @author PCENTER
 */
public  class Suite extends Habitacion {
    public boolean tieneJacuzzi;

    public Suite(int numeroHabitacion, double precioPorNoche, boolean tieneJacuzzi) {
        super(numeroHabitacion, precioPorNoche);
        this.tieneJacuzzi = tieneJacuzzi;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Tipo: Suite");
        System.out.println("Tiene jacuzzi: " + (tieneJacuzzi ? "Si" : "No"));
        System.out.println("--------------------------");
    }
}
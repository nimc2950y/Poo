/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionuniversidad;

/**
 *
 * @author PCENTER
 */
public class Estudiante extends MiembroUniversidad {
    public String carrera;
    public double promedio;

    public Estudiante(String nombre, String id, String correo, String carrera, double promedio) {
        super(nombre, id, correo);
        this.carrera = carrera;
        this.promedio = promedio;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Carrera: " + carrera);
        System.out.println("Promedio: " + promedio);
        System.out.println("---------------------------");
    }
}

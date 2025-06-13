/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionuniversidad;

/**
 *
 * @author PCENTER
 */
public class Docente extends MiembroUniversidad {
    public String materia;

    public Docente(String nombre, String id, String correo, String materia) {
        super(nombre, id, correo);
        this.materia = materia;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Materia que imparte: " + materia);
        System.out.println("---------------------------");
    }
}

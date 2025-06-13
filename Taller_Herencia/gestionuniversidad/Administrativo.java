/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionuniversidad;

/**
 *
 * @author PCENTER
 */
public class Administrativo extends MiembroUniversidad {
    public String departamento;

    public Administrativo(String nombre, String id, String correo, String departamento) {
        super(nombre, id, correo);
        this.departamento = departamento;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Departamento: " + departamento);
        System.out.println("---------------------------");
    }
}

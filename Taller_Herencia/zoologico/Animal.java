/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoologico;

/**
 *
 * @author PCENTER
 */
public class Animal {
    
    public String nombre;
    public int edad;
    public String tipoAlimentacion;

    public Animal(String nombre, int edad, String tipoAlimentacion) {
        this.nombre = nombre;
        this.edad = edad;
        this.tipoAlimentacion = tipoAlimentacion;
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Tipo de alimentacion: " + tipoAlimentacion);
    }

    public void comportamiento() {
        System.out.println("Comportamiento generico de animal.");
    }
}
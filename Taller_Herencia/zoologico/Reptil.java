/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoologico;

/**
 *
 * @author PCENTER
 */
public class Reptil extends Animal {
    public Reptil(String nombre, int edad, String tipoAlimentacion) {
        super(nombre, edad, tipoAlimentacion);
    }

    @Override
    public void comportamiento() {
        System.out.println("Este reptil repta.");
    }
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoologico;

/**
 *
 * @author PCENTER
 */
public class Ave extends Animal {
    public Ave(String nombre, int edad, String tipoAlimentacion) {
        super(nombre, edad, tipoAlimentacion);
    }

    @Override
    public void comportamiento() {
        System.out.println("Esta ave puede volar.");
    }
}

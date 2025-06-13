/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectonuevo;

/**
 *
 * @author PCENTER
 */
class Animal {
    public String tipo;
    public int edad;

    public Animal(String tipo, int edad) {
        this.tipo = tipo;
        this.edad = edad;
    }

    void mostrarEtapaVida() {
        if (edad <= 3) {
            System.out.println("Soy un cachorro");
        } else {
            System.out.println("Soy un adulto");
        }
    }
}

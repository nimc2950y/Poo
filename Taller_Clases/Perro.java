/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectonuevo;

/**
 *
 * @author PCENTER
 */
class Perro extends Animal {
    public String raza;
    public int vacunasColocadas;

    public Perro(String tipo, String raza, int edad, int vacunasColocadas) {
        super(tipo, edad);
        this.raza = raza;
        this.vacunasColocadas = vacunasColocadas;
    }

    void ladrar() {
        System.out.println("Guagua guagua - soy un " + raza);
    }

    void verificarVacunas() {
        if (edad <= 3) {
            System.out.println("Tengo 4 vacunas  ");
        } else {
            System.out.println("Tengo 7 vacunas  ");
        }
    }
}
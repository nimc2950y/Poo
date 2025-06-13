/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectonuevo;

/**
 *
 * @author PCENTER
 */
class Cuenta {
    public String titular;

    public Cuenta(String titular) {
        this.titular = titular;
    }

    public void mostrarTitular() {
        System.out.println("Titular de la cuenta: " + titular);
    }
}



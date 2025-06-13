/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package zoologico;
import java.util.Scanner;
/**
 *
 * @author PCENTER
 */
public class Zoologico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String continuar;

        do {
            System.out.println("\n--- Ingreso de Animal ---");

            System.out.print("Nombre: ");
            String nombre = scanner.nextLine();

            System.out.print("Edad: ");
            int edad = scanner.nextInt();
            scanner.nextLine(); 

            System.out.print("Tipo de alimentacion: ");
            String alimentacion = scanner.nextLine();

            System.out.print("Tipo (1: Ave, 2: Mamifero, 3: Reptil): ");
            int tipo = scanner.nextInt();
            scanner.nextLine();

            Animal animal;

            if (tipo == 1) {
                animal = new Ave(nombre, edad, alimentacion);
            } else if (tipo == 2) {
                animal = new Mamifero(nombre, edad, alimentacion);
            } else if (tipo == 3) {
                animal = new Reptil(nombre, edad, alimentacion);
            } else {
                System.out.println("Tipo invalido. Se registra como animal no reconocido.");
                animal = new Animal(nombre, edad, alimentacion);
            }

            System.out.println("\n--- Informacion del Animal ---");
            animal.mostrarInformacion();
            animal.comportamiento();

            System.out.print("\nDeseas ingresar otro animal? (si/no): ");
            continuar = scanner.nextLine();

        } while (continuar.equalsIgnoreCase("si"));

        System.out.println("\nUsted es gei >:v.");
        scanner.close();
    }
}
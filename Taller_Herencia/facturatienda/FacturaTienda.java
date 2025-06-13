/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package facturatienda;

/**
 *
 * @author PCENTER
 */
import java.util.Scanner;

public class FacturaTienda {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Facturacion de Productos Electronicos ===");
        System.out.println("Seleccione el tipo de producto:");
        System.out.println("1. Televisor");
        System.out.println("2. Telefono");
        System.out.println("3. Laptop");
        System.out.print("Opcion: ");
        int opcion = sc.nextInt();
        sc.nextLine(); // Limpiar buffer

        System.out.print("Nombre del producto: ");
        String nombre = sc.nextLine();

        System.out.print("Precio base: ");
        double precio = sc.nextDouble();

        switch (opcion) {
            case 1:
                System.out.print("Tamaño en pulgadas: ");
                int pulgadas = sc.nextInt();
                Televisor tv = new Televisor(nombre, precio, pulgadas);
                tv.mostrarInformacion();
                break;

            case 2:
                System.out.print("Numero de SIM: ");
                int sims = sc.nextInt();
                Telefono tel = new Telefono(nombre, precio, sims);
                tel.mostrarInformacion();
                break;

            case 3:
                System.out.print("Memoria RAM (GB): ");
                int ram = sc.nextInt();
                Laptop lap = new Laptop(nombre, precio, ram);
                lap.mostrarInformacion();
                break;

            default:
                System.out.println("Opcion no valida.");
        }

        sc.close();
    }
}


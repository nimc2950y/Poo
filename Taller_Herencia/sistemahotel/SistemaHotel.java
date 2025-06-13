/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistemahotel;
import java.util.Scanner;
/**
 *
 * @author PCENTER
 */
public class SistemaHotel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Sistema de Registro de Habitaciones ===");
        System.out.println("Ingrese el tipo de habitacion:");
        System.out.println("1. Estandar");
        System.out.println("2. Suite");
        System.out.println("3. Familiar");
        System.out.print("Opcion: ");
        int opcion = scanner.nextInt();

        System.out.print("Numero de habitacion: ");
        int numero = scanner.nextInt();

        System.out.print("Precio por noche: ");
        double precio = scanner.nextDouble();

        switch (opcion) {
            case 1:
                System.out.print("Tiene vista? (true/false): ");
                boolean vista = scanner.nextBoolean();
                HabitacionEstandar estandar = new HabitacionEstandar(numero, precio, vista);
                estandar.mostrarInformacion();
                break;

            case 2:
                System.out.print("Tiene jacuzzi? (true/false): ");
                boolean jacuzzi = scanner.nextBoolean();
                Suite suite = new Suite(numero, precio, jacuzzi);
                suite.mostrarInformacion();
                break;

            case 3:
                System.out.print("Capacidad para niños: ");
                int capacidad = scanner.nextInt();
                HabitacionFamiliar familiar = new HabitacionFamiliar(numero, precio, capacidad);
                familiar.mostrarInformacion();
                break;

            default:
                System.out.println("Opcion no valida.");
        }

        scanner.close();
    }
}

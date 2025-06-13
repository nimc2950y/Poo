/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gestionuniversidad;

import java.util.Scanner;

public class GestionUniversidad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el tipo de miembro:");
        System.out.println("1. Estudiante");
        System.out.println("2. Docente");
        System.out.println("3. Administrativo");
        System.out.print("Opcion: ");
        int opcion = sc.nextInt();
        sc.nextLine(); // Limpiar buffer

        System.out.print("Nombre: ");
        String nombre = sc.nextLine();
        System.out.print("ID: ");
        String id = sc.nextLine();
        System.out.print("Correo: ");
        String correo = sc.nextLine();

        switch (opcion) {
            case 1:
                System.out.print("Carrera: ");
                String carrera = sc.nextLine();
                System.out.print("Promedio: ");
                double promedio = sc.nextDouble();
                Estudiante est = new Estudiante(nombre, id, correo, carrera, promedio);
                est.mostrarInformacion();
                break;

            case 2:
                System.out.print("Materia que imparte: ");
                String materia = sc.nextLine();
                Docente doc = new Docente(nombre, id, correo, materia);
                doc.mostrarInformacion();
                break;

            case 3:
                System.out.print("Departamento: ");
                String depto = sc.nextLine();
                Administrativo adm = new Administrativo(nombre, id, correo, depto);
                adm.mostrarInformacion();
                break;

            default:
                System.out.println("Opcion no valida.");
        }

        sc.close();
    }
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package basedatospoo;

/**
 *
 * @author PCENTER
 */
import java.sql.*; // Importa todas las clases necesarias para conectarse y trabajar con bases de datos
import java.util.Scanner; // Importa la clase Scanner para leer datos ingresados por el usuario

public class BaseDatosPoo {
    public static void main(String[] args) {
        System.out.println("Gestion de vehiculos"); // Muestra un título en consola

        Scanner scanner = new Scanner(System.in); // Crea un objeto Scanner para leer entradas del usuario

        // Define la URL de conexión a una base de datos SQLite. Si no existe, se crea un archivo "vehiculos.db"
        String url = "jdbc:sqlite:vehiculos.db";

        // Intenta establecer una conexión con la base de datos
        try (Connection conn = DriverManager.getConnection(url)) {
            if (conn != null) {
                System.out.println("Hay coneccion con sql"); // Confirma que se logró la conexión

                // Sentencia SQL para crear la tabla 'vehiculos' si no existe
                String sqlCrear = "CREATE TABLE IF NOT EXISTS vehiculos (" +
                                  "id INTEGER PRIMARY KEY AUTOINCREMENT," + // ID autoincremental como clave primaria
                                  "tipo TEXT, marca TEXT, modelo TEXT)";     // Columnas tipo, marca y modelo

                Statement stmt = conn.createStatement(); // Crea un objeto Statement para ejecutar sentencias SQL
                stmt.execute(sqlCrear); // Ejecuta la sentencia SQL de creación de tabla

                boolean continuar = true; // Variable para controlar si el usuario quiere seguir ingresando vehículos

                // Bucle principal para registrar múltiples vehículos
                while (continuar) {
                    System.out.print("Ingrese tipo de vehículo (Auto/Moto): ");
                    String tipo = scanner.nextLine(); // Lee el tipo de vehículo

                    System.out.print("Ingrese la marca: ");
                    String marca = scanner.nextLine(); // Lee la marca del vehículo

                    System.out.print("Ingrese el modelo: ");
                    String modelo = scanner.nextLine(); // Lee el modelo del vehículo

                    Vehiculo vehiculo; // Declara una variable de tipo Vehiculo

                    // Según el tipo ingresado, se crea una instancia de Auto o Moto
                    if (tipo.equalsIgnoreCase("Auto")) {
                        vehiculo = new Auto(marca, modelo);
                    } else if (tipo.equalsIgnoreCase("Moto")) {
                        vehiculo = new Moto(marca, modelo);
                    } else {
                        System.out.println("Tipo inválido. Intente otra vez.");
                        continue; // Si el tipo es inválido, vuelve al inicio del bucle
                    }

                    vehiculo.mostrarInformacion(); // Muestra la información del vehículo usando polimorfismo

                    // Sentencia SQL para insertar los datos en la tabla 'vehiculos'
                    String sqlInsertar = "INSERT INTO vehiculos (tipo, marca, modelo) VALUES (?, ?, ?)";
                    PreparedStatement pstmt = conn.prepareStatement(sqlInsertar); // Prepara la sentencia para evitar SQL Injection
                    pstmt.setString(1, vehiculo.getTipo()); // Asigna el valor del tipo al primer signo de pregunta (?)
                    pstmt.setString(2, vehiculo.marca);    // Asigna la marca
                    pstmt.setString(3, vehiculo.modelo);   // Asigna el modelo
                    pstmt.executeUpdate(); // Ejecuta la inserción en la base de datos

                    System.out.print("¿Desea ingresar otro vehículo? (s/n): ");
                    String respuesta = scanner.nextLine(); // Lee la respuesta del usuario

                    if (respuesta.equalsIgnoreCase("n")) {
                        continuar = false; // Sale del bucle si la respuesta es 'n'
                    }
                }

                // Muestra todos los registros almacenados en la base de datos
                System.out.println("\n--- Vehiculos ingresados ---");
                String sqlSelect = "SELECT * FROM vehiculos"; // Consulta SQL para seleccionar todos los registros
                ResultSet rs = stmt.executeQuery(sqlSelect); // Ejecuta la consulta y obtiene los resultados

                while (rs.next()) {
                    // Muestra cada registro en formato: id - tipo - marca - modelo
                    System.out.println(rs.getInt("id") + " - " +
                                       rs.getString("tipo") + " - " +
                                       rs.getString("marca") + " - " +
                                       rs.getString("modelo"));
                }
            }
        } catch (SQLException e) {
            // Captura errores de SQL y los muestra
            System.out.println("Error con SQLite: " + e.getMessage());
        }

        System.out.println("--- FIN DEL PROGRAMA ---"); // Mensaje final
    }
}
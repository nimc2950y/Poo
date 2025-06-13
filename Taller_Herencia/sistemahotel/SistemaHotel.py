class Habitacion:
    def __init__(self, numero_habitacion, precio_por_noche):
        self.numero_habitacion = numero_habitacion
        self.precio_por_noche = precio_por_noche

    def mostrar_informacion(self):
        print(f"Habitacion #{self.numero_habitacion}")
        print(f"Precio por noche: ${self.precio_por_noche:.2f}")


class HabitacionEstandar(Habitacion):
    def __init__(self, numero_habitacion, precio_por_noche, tiene_vista):
        super().__init__(numero_habitacion, precio_por_noche)
        self.tiene_vista = tiene_vista

    def mostrar_informacion(self):
        super().mostrar_informacion()
        print("Tipo: Estandar")
        print(f"Tiene vista: {'Si' if self.tiene_vista else 'No'}")
        print("--------------------------")


class Suite(Habitacion):
    def __init__(self, numero_habitacion, precio_por_noche, tiene_jacuzzi):
        super().__init__(numero_habitacion, precio_por_noche)
        self.tiene_jacuzzi = tiene_jacuzzi

    def mostrar_informacion(self):
        super().mostrar_informacion()
        print("Tipo: Suite")
        print(f"Tiene jacuzzi: {'Si' if self.tiene_jacuzzi else 'No'}")
        print("--------------------------")


class HabitacionFamiliar(Habitacion):
    def __init__(self, numero_habitacion, precio_por_noche, capacidad_ninos):
        super().__init__(numero_habitacion, precio_por_noche)
        self.capacidad_ninos = capacidad_ninos

    def mostrar_informacion(self):
        super().mostrar_informacion()
        print("Tipo: Familiar")
        print(f"Capacidad para niños: {self.capacidad_ninos}")
        print("--------------------------")


def main():
    print("=== Sistema de Registro de Habitaciones ===")
    print("Ingrese el tipo de habitacion:")
    print("1. Estandar")
    print("2. Suite")
    print("3. Familiar")
    opcion = input("Opcion: ")

    try:
        numero = int(input("Numero de habitacion: "))
        precio = float(input("Precio por noche: "))

        if opcion == "1":
            vista_input = input("Tiene vista? (si/no): ").strip().lower()
            vista = vista_input == "si"
            habitacion = HabitacionEstandar(numero, precio, vista)

        elif opcion == "2":
            jacuzzi_input = input("Tiene jacuzzi? (si/no): ").strip().lower()
            jacuzzi = jacuzzi_input == "si"
            habitacion = Suite(numero, precio, jacuzzi)

        elif opcion == "3":
            capacidad = int(input("Capacidad para niños: "))
            habitacion = HabitacionFamiliar(numero, precio, capacidad)

        else:
            print("Opcion no valida.")
            return

        print("\n--- Detalles de la habitacion registrada ---")
        habitacion.mostrar_informacion()

    except ValueError:
        print("Error: Entrada no valida. Use numeros donde corresponde.")


# Ejecutar el programa
main()

# Clase base
class Animal:
    def __init__(self, nombre, edad, tipo_alimentacion):
        self.nombre = nombre
        self.edad = edad
        self.tipo_alimentacion = tipo_alimentacion

    def mostrar_informacion(self):
        print("Nombre:", self.nombre)
        print("Edad:", self.edad)
        print("Tipo de alimentacion:", self.tipo_alimentacion)

    def comportamiento(self):
        print("Comportamiento generico de animal.")

# Subclase Ave
class Ave(Animal):
    def comportamiento(self):
        print("Esta ave puede volar.")

# Subclase Mamifero
class Mamifero(Animal):
    def comportamiento(self):
        print("Este mamifero camina o corre.")

# Subclase Reptil
class Reptil(Animal):
    def comportamiento(self):
        print("Este reptil repta.")

# Funcion principal
def main():
    while True:
        print("\n--- Ingreso de Animal ---")
        nombre = input("Nombre: ")
        edad = int(input("Edad: "))
        tipo_alimentacion = input("Tipo de alimentacion: ")

        print("Tipo (1: Ave, 2: Mamifero, 3: Reptil): ", end="")
        tipo = input()

        if tipo == "1":
            animal = Ave(nombre, edad, tipo_alimentacion)
        elif tipo == "2":
            animal = Mamifero(nombre, edad, tipo_alimentacion)
        elif tipo == "3":
            animal = Reptil(nombre, edad, tipo_alimentacion)
        else:
            print("Tipo invalido. Se registra como animal generico.")
            animal = Animal(nombre, edad, tipo_alimentacion)

        print("\n--- Informacion del Animal ---")
        animal.mostrar_informacion()
        animal.comportamiento()

        continuar = input("\nDeseas ingresar otro animal? (si/no): ").lower()
        if continuar != "si":
            break

    print("\nGracias por usar el sistema del zoologico.")

# Ejecutar
main()

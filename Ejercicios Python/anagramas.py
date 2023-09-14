# Función para verificar si dos palabras son anagramas
def son_anagramas(palabra1, palabra2):
    # Eliminar espacios y convertir a minúsculas para una comparación más precisa
    palabra1 = palabra1.replace(" ", "").lower()
    palabra2 = palabra2.replace(" ", "").lower()

    # Verificar si las palabras tienen la misma cantidad de caracteres
    if len(palabra1) != len(palabra2):
        return False

    # Crear diccionarios para contar la frecuencia de cada carácter en ambas palabras
    contador1 = {}
    contador2 = {}

    for letra in palabra1:
        if letra in contador1:
            contador1[letra] += 1
        else:
            contador1[letra] = 1

    for letra in palabra2:
        if letra in contador2:
            contador2[letra] += 1
        else:
            contador2[letra] = 1

    # Verificar si los diccionarios son iguales
    return contador1 == contador2

# Pedir al usuario que ingrese las dos palabras
palabra1 = input("Ingresa la primera palabra: ")
palabra2 = input("Ingresa la segunda palabra: ")

# Verificar si son anagramas llamando a la función
if son_anagramas(palabra1, palabra2):
    print(f"'{palabra1}' y '{palabra2}' son anagramas.")
else:
    print(f"'{palabra1}' y '{palabra2}' no son anagramas.")

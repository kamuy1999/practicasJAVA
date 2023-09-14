# Pedir al usuario que ingrese una lista de números separados por espacios
entrada = input("Ingresa una lista de números separados por espacios: ")

# Dividir la entrada en una lista de números
numeros = [int(numero) for numero in entrada.split()]

# Comprobar si la lista tiene al menos dos elementos
if len(numeros) < 2:
    print("La lista debe tener al menos dos elementos para encontrar el segundo más grande.")
else:
    # Ordenar la lista en orden descendente
    numeros.sort(reverse=True)

    # El segundo elemento más grande es el elemento en la posición 1 (0-indexed)
    segundo_mas_grande = numeros[1]

    # Mostrar el resultado
    print(f"El segundo elemento más grande en la lista es: {segundo_mas_grande}")

# Pedir al usuario que ingrese una lista de números separados por espacios
entrada = input("Ingresa una lista de números separados por espacios: ")

# Dividir la entrada en una lista de números
numeros = [int(numero) for numero in entrada.split()]

# Crear una nueva lista ordenada en orden ascendente
lista_ordenada = sorted(numeros)

# Mostrar el resultado
print("Lista ordenada en orden ascendente:")
for numero in lista_ordenada:
    print(numero, end=" ")
print()

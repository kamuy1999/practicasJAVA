# Pedir al usuario que ingrese los números separados por espacios
entrada = input("Ingresa una lista de números separados por espacios: ")

# Dividir la entrada en una lista de números
numeros = [float(numero) for numero in entrada.split()]

# Comprobar si la lista está vacía
if not numeros:
    print("La lista está vacía. No se puede encontrar el mínimo y el máximo.")
else:
    # Encontrar el mínimo y el máximo utilizando las funciones min() y max()
    minimo = min(numeros)
    maximo = max(numeros)

    # Mostrar el resultado
    print(f"El mínimo de la lista es: {minimo}")
    print(f"El máximo de la lista es: {maximo}")

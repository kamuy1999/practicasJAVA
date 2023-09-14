# Función para verificar si un número es primo
def es_primo(numero):
    if numero <= 1:
        return False
    if numero <= 3:
        return True
    if numero % 2 == 0 or numero % 3 == 0:
        return False
    i = 5
    while i * i <= numero:
        if numero % i == 0 or numero % (i + 2) == 0:
            return False
        i += 6
    return True

# Pedir al usuario que ingrese el rango
inicio = int(input("Ingresa el número de inicio del rango: "))
fin = int(input("Ingresa el número de fin del rango: "))

# Verificar si el rango es válido
if inicio >= fin:
    print("El rango no es válido.")
else:
    # Generar una lista de números primos en el rango dado
    primos = [numero for numero in range(inicio, fin) if es_primo(numero)]

    # Mostrar la lista de números primos
    print("Números primos en el rango:")
    for primo in primos:
        print(primo, end=" ")
    print()

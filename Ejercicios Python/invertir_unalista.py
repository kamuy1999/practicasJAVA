# Pedir al usuario que ingrese una lista de elementos separados por espacios
entrada = input("Ingresa una lista de elementos separados por espacios: ")

# Dividir la entrada en una lista
lista = entrada.split()

# Invertir la lista en su lugar
lista.reverse()

# Mostrar la lista invertida
print("Lista invertida:")
for elemento in lista:
    print(elemento, end=" ")
print()

# Definir una función recursiva para calcular el factorial
def calcular_factorial(n):
    if n == 0:
        return 1
    else:
        return n * calcular_factorial(n - 1)

# Pedir al usuario que ingrese un número entero no negativo
numero = int(input("Ingresa un número entero no negativo: "))

# Verificar si el número es no negativo
if numero < 0:
    print("El número debe ser no negativo.")
else:
    # Calcular el factorial llamando a la función recursiva
    resultado = calcular_factorial(numero)
    print(f"El factorial de {numero} es: {resultado}")

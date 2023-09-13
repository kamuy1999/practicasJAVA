import java.util.Scanner;

public class CalcularSuma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa un número entero: ");
        int numero = scanner.nextInt();

        int suma = calcularSumaDigitos(numero);

        System.out.println("La suma de los dígitos de " + numero + " es: " + suma);

        scanner.close();
    }

    public static int calcularSumaDigitos(int num) {
        int suma = 0;

        while (num != 0) {
            int digito = num % 10;  // Obtiene el último dígito
            suma += digito;         // Suma el dígito al resultado
            num /= 10;              // Elimina el último dígito
        }

        return suma;
    }
}

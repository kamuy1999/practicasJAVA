import java.util.Scanner;

public class SumaDigitos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresar un número entero positivo: ");
        int numero = scanner.nextInt();

        int suma = 0;
        int numeroOriginal = numero;

        while (numero > 0) {
            int digito = numero % 10;
            suma += digito;
            numero /= 10;
        }

        System.out.println("La suma de los dígitos de " + numeroOriginal + " es: " + suma);

        scanner.close();
    }
}

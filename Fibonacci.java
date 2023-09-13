import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresar el número de términos de la secuencia de Fibonacci que deseas generar: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Por favor, ingresa un número mayor que cero.");
        } else {
            System.out.println("Secuencia de Fibonacci de " + n + " términos:");
            for (int i = 0; i < n; i++) {
                System.out.print(calcularFibonacci(i) + " ");
            }
        }

        scanner.close();
    }

    public static int calcularFibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return calcularFibonacci(n - 1) + calcularFibonacci(n - 2);
        }
    }
}


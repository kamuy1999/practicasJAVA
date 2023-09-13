import java.util.Scanner;

public class MinimoDeTresNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el primer número: ");
        double numero1 = scanner.nextDouble();

        System.out.print("Ingresa el segundo número: ");
        double numero2 = scanner.nextDouble();

        System.out.print("Ingresa el tercer número: ");
        double numero3 = scanner.nextDouble();

        double minimo = encontrarMinimo(numero1, numero2, numero3);

        System.out.println("El mínimo de los tres números es: " + minimo);

        scanner.close();
    }

    public static double encontrarMinimo(double num1, double num2, double num3) {
        if (num1 <= num2 && num1 <= num3) {
            return num1;
        } else if (num2 <= num1 && num2 <= num3) {
            return num2;
        } else {
            return num3;
        }
    }
}

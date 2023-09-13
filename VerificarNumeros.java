import java.util.Scanner;

public class VerificarNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa un número: ");
        double numero = scanner.nextDouble();

        verificarNumero(numero);

        scanner.close();
    }

    public static void verificarNumero(double num) {
        if (num > 0) {
            System.out.println(num + " es un número positivo.");
        } else if (num < 0) {
            System.out.println(num + " es un número negativo.");
        } else {
            System.out.println("El número es cero.");
        }
    }
}

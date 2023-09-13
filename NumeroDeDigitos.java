import java.util.Scanner;

public class NumeroDeDigitos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa un número entero: ");
        long numero = scanner.nextLong();

        int cantidadDigitos = calcularNumeroDeDigitos(numero);

        System.out.println("El número de dígitos en " + numero + " es: " + cantidadDigitos);

        scanner.close();
    }

    public static int calcularNumeroDeDigitos(long num) {
        // Convertir el número a una cadena para contar los dígitos
        String numStr = Long.toString(num);

        // Usar el método length() de la cadena para obtener la cantidad de dígitos
        return numStr.length();
    }
}

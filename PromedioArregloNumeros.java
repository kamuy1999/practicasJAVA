import java.util.Scanner;

public class PromedioArregloNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa la cantidad de números: ");
        int n = scanner.nextInt();

        double[] numeros = new double[n];

        // Leer los números
        for (int i = 0; i < n; i++) {
            System.out.print("Ingresa el número #" + (i + 1) + ": ");
            numeros[i] = scanner.nextDouble();
        }

        double promedio = calcularPromedio(numeros);

        System.out.println("El promedio de los números es: " + promedio);

        scanner.close();
    }

    public static double calcularPromedio(double[] numeros) {
        double suma = 0;

        for (double numero : numeros) {
            suma += numero;
        }

        return suma / numeros.length;
    }
}

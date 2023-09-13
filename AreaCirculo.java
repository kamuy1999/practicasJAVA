import java.util.Scanner;

public class AreaCirculo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresar el radio del círculo: ");
        double radio = scanner.nextDouble();

        double area = calcularAreaCirculo(radio);

        System.out.println("El área del círculo con radio " + radio + " es: " + area);

        scanner.close();
    }

    public static double calcularAreaCirculo(double radio) {
        // Utilice la fórmula del área del círculo: A = π * r^2
        return Math.PI * Math.pow(radio, 2);
    }
}

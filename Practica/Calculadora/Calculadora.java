import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("=== Calculadora Basica ===");
            System.out.print("Ingrese el primer número: ");
            double num1 = sc.nextDouble();
            
            System.out.print("Ingrese el segundo número: ");
            double num2 = sc.nextDouble();
            
            System.out.println("Seleccione la operación (+, -, *, /): ");
            char operacion = sc.next().charAt(0);
            
            double resultado;
            
            switch (operacion) {
                case '+' -> {
                    resultado = num1 + num2;
                    System.out.println("Resultado: " + resultado);
                }
                case '-' -> {
                    resultado = num1 - num2;
                    System.out.println("Resultado: " + resultado);
                }
                case '*' -> {
                    resultado = num1 * num2;
                    System.out.println("Resultado: " + resultado);
                }
                case '/' -> {
                    if (num2 != 0) {
                        resultado = num1 / num2;
                        System.out.println("Resultado: " + resultado);
                    } else {
                        System.out.println("Error: No se puede dividir entre 0.");
                    }
                }
                default -> System.out.println("Operación no válida.");
            }
        }
    }
}
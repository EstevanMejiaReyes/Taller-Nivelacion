import java.util.Scanner;

public class ContadorVocalesConsonantes {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("=== Contador de Vocales y Consonantes ===");
            System.out.print("Ingrese una palabra o frase: ");
            String texto = sc.nextLine().toLowerCase();
            
            int vocales = 0;
            int consonantes = 0;
            
            for (char c : texto.toCharArray()) {
                if (c >= 'a' && c <= 'z') {
                    if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                        vocales++;
                    } else {
                        consonantes++;
                    }
                }
            }
            
            System.out.println("Vocales: " + vocales);
            System.out.println("Consonantes: " + consonantes);
        }
    }
}
import java.util.Scanner;

public class SomaComParametro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o primeiro número: ");
        int num1 = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int num2 = scanner.nextInt();

        // Chamando o método soma com os dois números como parâmetros
        int resultado = soma(num1, num2);
        System.out.println("A soma dos números é: " + resultado);

        scanner.close();
    }

    // Método para somar dois números
    public static int soma(int a, int b) {
        return a + b;
    }
}

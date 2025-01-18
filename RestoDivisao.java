import java.util.Scanner; // Importa a classe Scanner para entrada de dados

public class RestoDivisao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Criação do Scanner
        int numero = 0; // Variável para armazenar o número digitado
        boolean entradaValida = false; // Flag para verificar se a entrada é válida

        // Loop para garantir que o usuário digite um número válido
        while (!entradaValida) {
            System.out.print("Digite um número inteiro: ");
            if (scanner.hasNextInt()) { // Verifica se a entrada é um número inteiro
                numero = scanner.nextInt(); // Lê o número inteiro
                entradaValida = true; // Marca como válida
            } else {
                System.out.println("Entrada inválida. Por favor, digite um número inteiro.");
                scanner.next(); // Descarta a entrada inválida
            }
        }

        // Verifica se o número é par ou ímpar
        if (numero % 2 == 0) {
            System.out.println("O número " + numero + " é par.");
        } else {
            System.out.println("O número " + numero + " é ímpar.");
        }

        scanner.close(); // Fecha o Scanner
    }
}

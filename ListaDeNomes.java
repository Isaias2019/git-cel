import java.util.ArrayList;
import java.util.Scanner;

public class ListaDeNomes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> nomes = new ArrayList<>();
        
        System.out.print("Quantos nomes você deseja adicionar? ");
        int quantidade = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha

        for (int i = 0; i < quantidade; i++) {
            System.out.print("Digite o nome #" + (i + 1) + ": ");
            String nome = scanner.nextLine();
            nomes.add(nome); // Adiciona o nome na lista
        }

        // Chamando o método para exibir os nomes
        exibirNomes(nomes);

        scanner.close();
    }

    // Método para exibir os nomes armazenados na lista
    public static void exibirNomes(ArrayList<String> lista) {
        System.out.println("Os nomes inseridos são:");
        for (String nome : lista) {
            System.out.println("- " + nome);
        }
    }
}

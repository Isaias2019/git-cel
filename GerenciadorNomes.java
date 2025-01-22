import java.util.Scanner;

public class GerenciadorNomes {
    public static void main(String[] args) {
        // Criando um objeto da classe ListaNomes
        ListaNomes lista = new ListaNomes();

        // Chamando o método para preencher a lista
        lista.preencherNomes();

        // Chamando o método para exibir os nomes
        lista.exibirNomes();
    }
}

class ListaNomes {
    // Vetor para armazenar os nomes
    private String[] nomes;

    // Construtor para inicializar o vetor
    public ListaNomes() {
        nomes = new String[5]; // Vetor de tamanho fixo (5 nomes)
    }

    // Método para preencher os nomes (encapsulado)
    public void preencherNomes() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite 5 nomes:");
        for (int i = 0; i < nomes.length; i++) {
            System.out.print("Nome " + (i + 1) + ": ");
            nomes[i] = scanner.nextLine(); // Lê o nome digitado pelo usuário
        }

        // Fecha o scanner para liberar recursos
        scanner.close();
    }

    // Método para exibir os nomes (encapsulado)
    public void exibirNomes() {
        System.out.println("\nNomes digitados:");
        for (int i = 0; i < nomes.length; i++) {
            System.out.println("Posição " + i + ": " + nomes[i]);
        }
    }
}

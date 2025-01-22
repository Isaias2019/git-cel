import java.util.ArrayList;
import java.util.Scanner;

public class GerenciarLista {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> itens = new ArrayList<>();

        // Adicionando itens na lista
        System.out.print("Quantos itens você deseja adicionar? ");
        int quantidade = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha

        for (int i = 0; i < quantidade; i++) {
            System.out.print("Digite o item #" + (i + 1) + ": ");
            String item = scanner.nextLine();
            itens.add(item);
        }

        System.out.println("Itens na lista: " + itens);

        // Removendo um item da lista
        System.out.print("Digite o nome do item que deseja remover: ");
        String itemRemover = scanner.nextLine();

        // Chamando o método para remover o item
        removerItem(itens, itemRemover);

        System.out.println("Lista final: " + itens);
        scanner.close();
    }

    // Método para remover um item da lista
    public static void removerItem(ArrayList<String> lista, String item) {
        if (lista.contains(item)) {
            lista.remove(item);
            System.out.println("O item \"" + item + "\" foi removido.");
        } else {
            System.out.println("O item \"" + item + "\" não foi encontrado.");
        }
    }
}

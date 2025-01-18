class Aluno {
    String nome;
    double nota1;
    double nota2;

    // Método para calcular a média do aluno
    double calcularMedia() {
        return (nota1 + nota2) / 2;
    }

    // Método para exibir os dados do aluno e a média
    void exibirDados() {
        System.out.println("Nome do Aluno: " + nome);
        System.out.println("Nota 1: " + nota1);
        System.out.println("Nota 2: " + nota2);
        System.out.println("Média Anual: " + calcularMedia());
    }

    // Método para verificar a situação do aluno
    void situacao() {
        double media = calcularMedia();
        if (media >= 7) {
            System.out.println("Situação: Aprovado");
        } else if (media >= 5) {
            System.out.println("Situação: Recuperação");
        } else {
            System.out.println("Situação: Reprovado");
        }
    }
}

public class ManipulacaoArray {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();

        aluno.nome = "José Isaías";
        aluno.nota1 = 7.5;
        aluno.nota2 = 6;

        aluno.exibirDados();
        aluno.situacao(); // Chama o método para exibir a situação do aluno
    }
}

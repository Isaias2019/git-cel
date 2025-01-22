import java.util.ArrayList;
import java.util.Scanner;
public class CadastroNomes {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> nomes = new ArrayList<>();
        
        while(true){
            System.out.println("Digite um Nome: ");
            String nome = scanner.nextLine();
            if(nome.equalsIgnoreCase("sair")){
                System.out.println("ate logo encerrado");
                break;
                
            }
            nomes.add(nome);
            
            
        }
        
        System.out.println("Nomes da Lista");
        for(String nome : nomes){
            System.out.println(nome);
        }
        scanner.close();
    }
    
}
import java.util.Scanner;

public class ex005 {
    public static void main(String[] args) throws Exception {
        Scanner enterScanner = new Scanner(System.in);

        String nome, endereco, telefone; 

        System.out.println("Nome do cliente: ");
        nome = enterScanner.nextLine();

        System.out.println("Endereço do cliente: ");
        endereco = enterScanner.nextLine();

        System.out.println("Telefone do cliente: ");
        telefone = enterScanner.nextLine();


        System.out.println("Nome do cliente: " + nome);
        System.out.println("Endereço do cliente: " + endereco);
        System.out.println("Telefone do cliente: " + telefone);


        enterScanner.close();
    }
}

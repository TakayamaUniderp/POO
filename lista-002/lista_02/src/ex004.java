import java.util.Scanner;

public class ex004 {
    public static void main(String[] args) throws Exception {
        Scanner enterScanner = new Scanner(System.in);

        int a, antecessor, sucessor; 

        System.out.println("Digite algum número: ");
        a = enterScanner.nextInt();

        antecessor = a - 1;
        sucessor = a + 1;

        System.out.println("O antecessor de " + a + " é: " + antecessor);
        System.out.println("O sucessor de " + a + " é: " + sucessor);


        enterScanner.close();
    }
}

import java.util.Scanner;

public class ex001 {
    public static void main(String[] args) throws Exception {
        Scanner enterScanner = new Scanner(System.in);

        int a, b, c; 

        System.out.println("Digite o primeiro número: ");
        a = enterScanner.nextInt();

        System.out.println("Digite o segundo número: ");
        b = enterScanner.nextInt();

        c = a + b;

        System.out.println("O resultado da soma é:  " + c);

        enterScanner.close();
    }
}

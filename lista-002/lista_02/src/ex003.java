import java.util.Scanner;

public class ex003 {
    public static void main(String[] args) throws Exception {
        Scanner enterScanner = new Scanner(System.in);

        int a, b, c, soma, media; 

        System.out.println("Digite o primeiro número: ");
        a = enterScanner.nextInt();

        System.out.println("Digite o segundo número: ");
        b = enterScanner.nextInt();

        System.out.println("Digite o terceiro número: ");
        c = enterScanner.nextInt();
        
        soma = (a + b + c);
        media = soma / 3;
        

        System.out.println("A soma entre " + a + " + " + b + " + " + c + " é " + " = " + soma);
        System.out.println("A média é:  " + media);

        enterScanner.close();
    }
}
import java.util.Scanner;

public class ex006 {
    public static void main(String[] args) throws Exception {
        Scanner enterScanner = new Scanner(System.in);

        Float original, reajustado; 

        System.out.println("Saldo atual: ");
        original = enterScanner.nextFloat();

        reajustado = original * 0.02f + original;
        

        System.out.println("Após reajuste, o saldo é: R$ " + reajustado);


        enterScanner.close();
    }
}

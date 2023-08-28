import java.util.Scanner;

public class ex008 {
    public static void main(String[] args) throws Exception {
        Scanner enterScanner = new Scanner(System.in);

        Float salarioantigo, percentual, salarionovo;

        System.out.println("Digite o salário atual do funcionário: ");
        salarioantigo = enterScanner.nextFloat();

        System.out.println("Digite o percentual que será ajustado: ");
        percentual = enterScanner.nextFloat();

        salarionovo = salarioantigo + salarioantigo * (percentual / 100);
        
        System.out.println("Salário antigo: R$ " + salarioantigo);
        System.out.println("Percentual de aumento:  " + percentual + "%");
        System.out.println("Salário novo: R$ " + salarionovo);

        enterScanner.close();
    }
}
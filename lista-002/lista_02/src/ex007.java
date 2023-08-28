import java.util.Scanner;

public class ex007 {
    public static void main(String[] args) throws Exception {
        Scanner enterScanner = new Scanner(System.in);

        Float base, altura, perimetro, area; 

        System.out.println("Digite o valor da base do retângulo: ");
        base = enterScanner.nextFloat();

        System.out.println("Digite o valor da altura: ");
        altura = enterScanner.nextFloat();

        perimetro = 2 * (base + altura);
        area = base * altura;

        System.out.println("O valor d perímetro é :  " + perimetro);
        System.out.println("O valor da area é:  " + area);

        enterScanner.close();
    }
}
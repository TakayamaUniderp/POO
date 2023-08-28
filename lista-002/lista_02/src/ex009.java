import java.util.Scanner;

public class ex009 {
    public static void main(String[] args) throws Exception {
        Scanner enterScanner = new Scanner(System.in);

        int centigrados, fahrenheit;

        System.out.println("Digite a temperatura em graus Centígrados: ");
        centigrados = enterScanner.nextInt();

        fahrenheit = ((9 * centigrados) + 160)/5 ;

        System.out.println("Temperatura em graus Fahrenheit: " + fahrenheit);

        enterScanner.close();
    }
}
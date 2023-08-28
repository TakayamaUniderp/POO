import java.util.Scanner;

public class ex010 {
    public static void main(String[] args) throws Exception {
        Scanner enterScanner = new Scanner(System.in);

        int vm, tempo, distancia, litros;

        System.out.println("Tempo de viagem (em horas): ");
        tempo = enterScanner.nextInt();

        System.out.println("Velocidade média em KM/h: ");
        vm = enterScanner.nextInt();

        distancia = vm * tempo; 
        litros = distancia / 12;

        System.out.println();

        System.out.println("Tempo de viagem: " + tempo + " horas");
        System.out.println("Velocidade média: " + vm + " KM/h");
        System.out.println("Distância: " + distancia + " KMs");
        System.out.println("Combustível gasto (em litros): " + litros + " litros");


        enterScanner.close();
    }
}

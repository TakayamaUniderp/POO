import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Passageiro p1 = new Passageiro(0, "Andre", "2929", "andgmail.com", "67996582", LocalDate.of(1990, 1, 1), "123", "andtaka", "v7v7", "0249");
        p1.passageiroStatus();

        Funcionario f1 = new Funcionario(12, "Nikolas", "22", "Nikolas@gmail.com", "76-9982491", LocalDate.of(1992, 12, 23), "222222", "Nik", "t26", "Niko", "24231");
        f1.funcionarioStatus();
    }
}

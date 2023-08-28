import java.time.LocalDate;

public class Main {
    public static void main(String[] args) throws Exception {
        LocalDate dataNascimentoEstudante01 = LocalDate.of(2000, 5, 10);
        LocalDate dataInsercaoEstudante01 = LocalDate.of(2023, 8, 27);
        LocalDate dataMatriculaEstudante01 = LocalDate.of(2023, 1, 02);
        
        Aluno estudante01 = new Aluno(01, "André", "Rua Fulaninha", "909826-9797", dataNascimentoEstudante01, "04267", "04587890448-32", dataInsercaoEstudante01, "14121f", dataMatriculaEstudante01);
        estudante01.aluno();

        LocalDate dataNascimentoProfessor01 = LocalDate.of(2000, 5, 10);
        LocalDate dataInsercaoProfessor01 = LocalDate.of(2023, 8, 27);
        LocalDate dataContratacaoProfessor01 = LocalDate.of(2023, 1, 02);

        Professor docente01 = new Professor(01, "Takayama", "Rua Nikas Pantmun", "901226-9797", dataNascimentoProfessor01, "04267", "04587890448-32", dataInsercaoProfessor01, "14121f", dataContratacaoProfessor01);
        docente01.getNome();
        docente01.professor();
    }
}

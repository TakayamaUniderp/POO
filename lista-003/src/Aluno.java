import java.time.LocalDate;

public class Aluno extends BasePessoa {
    String matricula;
    LocalDate dataMatricula;

    Aluno(int codigo, String nome, String endereco, String telefone, LocalDate dataNascimento, String rg, 
    String cpf, LocalDate dataInsercao, String matricula, LocalDate dataMatricula) {

        super(codigo, nome, endereco, telefone, dataNascimento, rg, cpf, dataInsercao);
        
        this.matricula = matricula;
        this.dataMatricula = dataMatricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public LocalDate getDataMatricula() {
        return dataMatricula;
    }
    
    public void aluno (){
        System.out.println("Código: " + getCodigo());
        System.out.println("Nome: " + getNome());
        System.out.println("Endereço: " + getEndereco());
        System.out.println("Telefone: " + getTelefone());
        System.out.println("Data de Nascimento: " + getDataNascimento());
        System.out.println("RG: " + getRg());
        System.out.println("CPF: " + getCpf());
        System.out.println("Matrícula: " + getMatricula());
        System.out.println("Data de Nascimento: " + getDataNascimento());
        System.out.println("Data de Inserção: " + getDataInsercao());
        System.out.println("Data de Matrícula: " + getDataMatricula());
    }


}
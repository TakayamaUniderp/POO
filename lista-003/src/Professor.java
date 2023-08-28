import java.time.LocalDate;

public class Professor extends BasePessoa {
        String registro;
        LocalDate dataContratacao;

        Professor(int codigo, String nome, String endereco, String telefone, LocalDate dataNascimento, 
            String rg, String cpf, LocalDate dataInsercao, String registro, LocalDate dataContratacao) {
            
            super(codigo, nome, endereco, telefone, dataNascimento, rg, cpf, dataInsercao);

            this.registro = registro;
            this.dataContratacao = dataContratacao;
        }
    
        public String getRegistro() {
            return registro;
        }

        public LocalDate getDataContratacao() {
            return dataContratacao;
        }

        public void professor (){
            System.out.println("Código: " + getCodigo());
            System.out.println("Nome: " + getNome());
            System.out.println("Endereço: " + getEndereco());
            System.out.println("Telefone: " + getTelefone());
            System.out.println("Data de Nascimento: " + getDataNascimento());
            System.out.println("RG: " + getRg());
            System.out.println("CPF: " + getCpf());
            System.out.println("Matrícula: " + getRegistro());
            System.out.println("Data de Nascimento: " + getDataNascimento());
            System.out.println("Data de Inserção: " + getDataInsercao());
            System.out.println("Data de Matrícula: " + getDataContratacao());
        }
}

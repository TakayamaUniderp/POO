import java.time.LocalDate;

public class BasePessoa {
    private int codigo;
    private String nome;
    private String endereco;
    private String telefone;
    private LocalDate dataNascimento;
    private String rg;
    private String cpf;
    private LocalDate dataInsercao;

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public String getRg() {
        return rg;
    }

    public String getCpf() {
        return cpf;
    }

    public LocalDate getDataInsercao() {
        return dataInsercao;
    }

    public BasePessoa(int codigo, String nome, String endereco, String telefone, 
    LocalDate dataNascimento, String rg, String cpf, LocalDate dataInsercao) {
    
        this.codigo = codigo;
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.dataNascimento = dataNascimento;
        this.rg = rg;
        this.cpf = cpf;
        this.dataInsercao = dataInsercao;
    }
    
}
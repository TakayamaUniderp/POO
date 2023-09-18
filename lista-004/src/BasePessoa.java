import java.time.LocalDate;

public abstract class BasePessoa {
    private int codigo;
    private String nome;
    private String documento;
    private String email;
    private String telefone;
    private LocalDate dataNascimento;
    private String registro;
    private String usuario;
    private String senha;
    
    

    public BasePessoa(int codigo, String nome, String documento, String email, String telefone,
            LocalDate dataNascimento, String registro, String usuario, String senha) {
        this.codigo = codigo;
        this.nome = nome;
        this.documento = documento;
        this.email = email;
        this.telefone = telefone;
        this.dataNascimento = dataNascimento;
        this.registro = registro;
        this.usuario = usuario;
        this.senha = senha;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getRegistro() {
        return registro;
    }

    public void setRegistro(String registro) {
        this.registro = registro;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

}



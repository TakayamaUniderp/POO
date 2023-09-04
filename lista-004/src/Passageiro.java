import java.time.LocalDate;

public class Passageiro extends BasePessoa {
    private String numeroCartao;

    public Passageiro(int codigo, String nome, String documento, String email, String telefone,
            LocalDate dataNascimento, String registro, String usuario, String senha, String numeroCartao) {
        super(codigo, nome, documento, email, telefone, dataNascimento, registro, usuario, senha);
        
        this.numeroCartao = numeroCartao;
    }

    public String getNumeroCartao() {
        return numeroCartao;
    }

    public void setNumeroCartao(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    public void passageiroStatus(){
        System.out.println("CÓDIGO:" + getCodigo());
        System.out.println("NOME:" + getNome());
        System.out.println("DOCUMENTO:" + getDocumento());
        System.out.println("EMAIL:" + getEmail());
        System.out.println("TELEFONE:" + getTelefone());
        System.out.println("DATA DE NASCIMENTO: " + getDataNascimento());
        System.out.println("REGISTRO" + getRegistro());
        System.out.println("USUÁRIO: " + getUsuario());
        System.out.println("SENHA: " + getSenha());
        System.out.println("NÚMERO DO CARTÃO: " + getNumeroCartao());
        System.out.println();
    }
    
}

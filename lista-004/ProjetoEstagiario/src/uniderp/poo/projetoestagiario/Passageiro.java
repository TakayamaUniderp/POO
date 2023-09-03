package uniderp.poo.projetoestagiario;

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

    
}

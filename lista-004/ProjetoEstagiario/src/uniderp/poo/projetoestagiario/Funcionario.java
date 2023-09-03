package uniderp.poo.projetoestagiario;

import java.time.LocalDate;

public class Funcionario extends BasePessoa {
    private String cracha;
    private String contaCorrente;

    public Funcionario(int codigo, String nome, String documento, String email, String telefone,
            LocalDate dataNascimento, String registro, String usuario, String senha, String cracha,
            String contaCorrente) {
        super(codigo, nome, documento, email, telefone, dataNascimento, registro, usuario, senha);
        this.cracha = cracha;
        this.contaCorrente = contaCorrente;
    }

    public String getCracha() {
        return cracha;
    }

    public void setCracha(String cracha) {
        this.cracha = cracha;
    }

    public String getContaCorrente() {
        return contaCorrente;
    }

    public void setContaCorrente(String contaCorrente) {
        this.contaCorrente = contaCorrente;
    }

}
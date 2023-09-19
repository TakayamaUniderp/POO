package uniderp.poo.escola.dominio;

import java.time.LocalDate;

public class Professor extends BaseFuncionario implements IImpressao {
    private String cadeira;

    public Professor(int id, LocalDate dataInsercao, String endereco, String telefone, String nome, String rg,
            String cpf, LocalDate dataNascimento, String cracha, String registro, LocalDate dataVinculoInicial,
            LocalDate dataVinculoFinal, String cadeira) {
        super(id, dataInsercao, endereco, telefone, nome, rg, cpf, dataNascimento, cracha, registro, dataVinculoInicial,
                dataVinculoFinal);
        this.cadeira = cadeira;
    }

    public String getCadeira() {
        return cadeira;
    }

    public void setCadeira(String cadeira) {
        this.cadeira = cadeira;
    }
    
    @Override
    public void Imprimir() {
        System.out.println("Codigo: " + this.id);
        System.out.println("Nome: " + this.nome);
        System.out.println("Endereço: " + this.nome);
        System.out.println("Telefone: " + this.telefone);
        System.out.println("RG: " + this.rg);
        System.out.println("CPF: " + this.cpf);
        System.out.println("Data de Nascimento: " + this.dataNascimento);
        System.out.println("Crachá: " + this.cracha);
        System.out.println("Registro: " + this.registro);
        System.out.println("Cadeira: " + this.cadeira);
        System.out.println("Data de Vínculo Inicial: " + this.dataVinculoInicial);
        System.out.println("Data de Vínculo Final: " + this.dataVinculoFinal);
        System.out.println("Data de Inserção:" + this.dataInsercao);
    }



}
package ProjetoVeiculosEstagiario;
public class Aviao extends BaseVeiculo {

    private int qtdeMotores;
    private String registroAereo;

    public Aviao(int id, String nome, String modelo, String cor, int anoModelo, int anoFabricacao,
            String pesoLiquido, String pesoTotal, int assentos, int rodas, String fabricante, double potencia,
            String tipoCombustivel, String nomeProprietario, String tipoVeiculo, int qtdeOcupantes, int qtdeMotores,
            String registroAereo) {
        super(id, nome, modelo, cor, anoModelo, anoFabricacao, pesoLiquido, pesoTotal, assentos, rodas,
                fabricante, potencia, tipoCombustivel, nomeProprietario, tipoVeiculo, qtdeOcupantes);
        this.qtdeMotores = qtdeMotores;
        this.registroAereo = registroAereo;
    }

    public int getQtdeMotores() {
        return qtdeMotores;
    }

    public void setQtdeMotores(int qtdeMotores) {
        this.qtdeMotores = qtdeMotores;
    }

    public String getCertificadoTripulacao() {
        return registroAereo;
    }

    public void setRegistroAereo(String registroAereo) {
        this.registroAereo = registroAereo;
    }
    
    public void imprimir(){
        System.out.println("CÓDIGO: " + this.id);
        System.out.println("NOME: " + this.nome);
        System.out.println("MODELO: " + this.modelo);
        System.out.println("ANO DE FABRICAÇÃO: " + this.anoFabricacao);
        System.out.println("PESO LÍQUIDO: " + this.pesoLiquido);
        System.out.println("PESO TOTAL: " + this.pesoTotal);
        System.out.println("ASSENTOS: " + this.assentos);
        System.out.println("RODAS: " + this.rodas);
        System.out.println("FABRICANTE: " + this.fabricante);
        System.out.println("POTÊNCIA " + this.potencia);
        System.out.println("TIPO DE COMBUSTÍVEL: " + this.tipoCombustivel);
        System.out.println("NOME DO PROPRIETÁRIO: " + this.nomeProprietario);
        System.out.println("TIPO DE VEÍCULO: " + this.tipoVeiculo);
        System.out.println("QUANTIDADE DE OCUPANTES: " + this.qtdeOcupantes);
        System.out.println("QUANTIDADE DE MOTORES: " + this.qtdeMotores);
        System.out.println("CERTIFICADO DE TRIPULAÇÃO: " + this.registroAereo);
        System.out.println("");
    }
}

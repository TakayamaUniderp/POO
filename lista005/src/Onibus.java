public class Onibus extends BaseTerrestre {
    
    private int portas;
    private String rotas;

    public Onibus(String id, String nome, String modelo, String cor, int anoModelo, int anoFabricacao,
            String pesoLiquido, String pesoTotal, int assentos, int rodas, String fabricante, double potencia,
            String tipoCombustivel, String nomeProprietario, String tipoVeiculo, int qtdeOcupantes, String chassi,
            String placa, String codigoRenavam, String estadoUF, String cidadeUF, int portas, String rotas) {
        super(id, nome, modelo, cor, anoModelo, anoFabricacao, pesoLiquido, pesoTotal, assentos, rodas,
                fabricante, potencia, tipoCombustivel, nomeProprietario, tipoVeiculo, qtdeOcupantes, chassi, placa,
                codigoRenavam, estadoUF, cidadeUF);
        this.portas = portas;
        this.rotas = rotas;
    }

    public int getPortas() {
        return portas;
    }

    public void setPortas(int portas) {
        this.portas = portas;
    }

    public String getRotas() {
        return rotas;
    }

    public void setRotas(String rotas) {
        this.rotas = rotas;
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
        System.out.println("CHASSI: " + this.chassi);
        System.out.println("PLACA: " + this.placa);
        System.out.println("CÓDIGO RENAVAM" + this.codigoRenavam);
        System.out.println("ESTADO UF: " + this.estadoUF);
        System.out.println("CIDADE UF: " + this.cidadeUF);
        System.out.println("PORTAS: " + this.portas);
        System.out.println("RODAS: " + this.rotas);
    }

}

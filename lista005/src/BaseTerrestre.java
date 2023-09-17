abstract class BaseTerrestre extends BaseVeiculo {
    
    protected String chassi;
    protected String placa;
    protected String codigoRenavam;
    protected String estadoUF;
    protected String cidadeUF;
    
    public BaseTerrestre(String id, String nome, String modelo, String cor, int anoModelo,
            int anoFabricacao, String pesoLiquido, String pesoTotal, int assentos, int rodas, String fabricante,
            double potencia, String tipoCombustivel, String nomeProprietario, String tipoVeiculo, int qtdeOcupantes,
            String chassi, String placa, String codigoRenavam, String estadoUF, String cidadeUF) {
        super(id, nome, modelo, cor, anoModelo, anoFabricacao, pesoLiquido, pesoTotal, assentos, rodas,
                fabricante, potencia, tipoCombustivel, nomeProprietario, tipoVeiculo, qtdeOcupantes);
        this.chassi = chassi;
        this.placa = placa;
        this.codigoRenavam = codigoRenavam;
        this.estadoUF = estadoUF;
        this.cidadeUF = cidadeUF;
    }

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCodigoRenavam() {
        return codigoRenavam;
    }

    public void setCodigoRenavam(String codigoRenavam) {
        this.codigoRenavam = codigoRenavam;
    }

    public String getEstadoUF() {
        return estadoUF;
    }

    public void setEstadoUF(String estadoUF) {
        this.estadoUF = estadoUF;
    }

    public String getCidadeUF() {
        return cidadeUF;
    }

    public void setCidadeUF(String cidadeUF) {
        this.cidadeUF = cidadeUF;
    }

    
}
abstract class BaseVeiculo extends BaseId {
    
    protected int codigo;
    protected String nome;
    protected String modelo;
    protected String cor;
    protected int anoModelo;
    protected int anoFabricacao;
    protected String pesoLiquido;
    protected String pesoTotal;
    protected int assentos;
    protected int rodas;
    protected String fabricante;
    protected double potencia;
    protected String tipoCombustivel;
    protected String nomeProprietario;
    protected String tipoVeiculo;
    protected int qtdeOcupantes;

    public BaseVeiculo(String id, String nome, String modelo, String cor, int anoModelo, int anoFabricacao,
            String pesoLiquido, String pesoTotal, int assentos, int rodas, String fabricante, double potencia,
            String tipoCombustivel, String nomeProprietario, String tipoVeiculo, int qtdeOcupantes) {
        super(id);
        this.nome = nome;
        this.modelo = modelo;
        this.cor = cor;
        this.anoModelo = anoModelo;
        this.anoFabricacao = anoFabricacao;
        this.pesoLiquido = pesoLiquido;
        this.pesoTotal = pesoTotal;
        this.assentos = assentos;
        this.rodas = rodas;
        this.fabricante = fabricante;
        this.potencia = potencia;
        this.tipoCombustivel = tipoCombustivel;
        this.nomeProprietario = nomeProprietario;
        this.tipoVeiculo = tipoVeiculo;
        this.qtdeOcupantes = qtdeOcupantes;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAnoModelo() {
        return anoModelo;
    }

    public void setAnoModelo(int anoModelo) {
        this.anoModelo = anoModelo;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public String getPesoLiquido() {
        return pesoLiquido;
    }

    public void setPesoLiquido(String pesoLiquido) {
        this.pesoLiquido = pesoLiquido;
    }

    public String getPesoTotal() {
        return pesoTotal;
    }

    public void setPesoTotal(String pesoTotal) {
        this.pesoTotal = pesoTotal;
    }

    public int getAssentos() {
        return assentos;
    }

    public void setAssentos(int assentos) {
        this.assentos = assentos;
    }

    public int getRodas() {
        return rodas;
    }

    public void setRodas(int rodas) {
        this.rodas = rodas;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    public String getTipoCombustivel() {
        return tipoCombustivel;
    }

    public void setTipoCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }

    public String getNomeProprietario() {
        return nomeProprietario;
    }

    public void setNomeProprietario(String nomeProprietario) {
        this.nomeProprietario = nomeProprietario;
    }

    public String getTipoVeiculo() {
        return tipoVeiculo;
    }

    public void setTipoVeiculo(String tipoVeiculo) {
        this.tipoVeiculo = tipoVeiculo;
    }

    public int getQtdeOcupantes() {
        return qtdeOcupantes;
    }

    public void setQtdeOcupantes(int qtdeOcupantes) {
        this.qtdeOcupantes = qtdeOcupantes;
    }

    
}

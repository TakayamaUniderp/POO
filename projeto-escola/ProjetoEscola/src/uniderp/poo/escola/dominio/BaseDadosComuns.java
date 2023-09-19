package uniderp.poo.escola.dominio;

import java.time.LocalDate;

public class BaseDadosComuns extends BaseId {
    protected LocalDate dataInsercao;

    public BaseDadosComuns(int id, LocalDate dataInsercao) {
        super(id);
        this.dataInsercao = dataInsercao;
    }

    public LocalDate getDataInsercao() {
        return dataInsercao;
    }

    public void setDataInsercao(LocalDate dataInsercao) {
        this.dataInsercao = dataInsercao;
    }

    
}

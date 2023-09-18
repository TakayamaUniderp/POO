package ProjetoVeiculosEstagiario;
abstract class BaseId {
   
    protected int id;

    public BaseId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
}

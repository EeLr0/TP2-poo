import java.time.LocalDateTime;

public class Grupo {
    //numero de identificacao do grupo;
    private int id;
    //data criacao do grupo
    private LocalDateTime data;
    //estado do grupo ativo = True/inativo=False
    private boolean estado;
    /**
     * metodo construtor da classe Grupo
     * */
    public Grupo() {
        int i = 1;
        this.id = i++;
        this.data = LocalDateTime.now();
        this.estado = true;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
}

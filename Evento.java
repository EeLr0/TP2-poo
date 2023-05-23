public class Evento {
    //numero de identificacao evento
    private int id;
    //nome do evento
    private String nome;
    //tipo de evento
    private TipoEvento tipo;

    /**
     * Metodo construtor da classe Evento
     * */
    public Evento(int id, String nome, TipoEvento tipo) {
        this.id = id;
        this.nome = nome;
        this.tipo = tipo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public TipoEvento getTipo() {
        return tipo;
    }

    public void setTipo(TipoEvento tipo) {
        this.tipo = tipo;
    }
}

import java.util.Date;

/**
 * Representa uma postagem de evento na rede social.
 */
public class PedradaEvento extends Pedrada {
    private TipoEvento TipoEvento; // representação do tipo de evento
    private Date Data; // data do evento
    private String local; // local do evento
    private boolean entrada; // representa se o utilizador tem ou não o direito de entrar
    private String status; // variável que armazena o status atual

    /**
     * Construtor da classe PedradaEvento.
     *
     * @param username    O nome de usuário do autor da postagem.
     * @param tipoEvento  O tipo de evento da postagem.
     * @param data        A data do evento.
     * @param local       O local do evento.
     * @param entrada     Indica se o usuário tem direito de entrar no evento.
     * @param status      O status atual da postagem.
     */
    public PedradaEvento(String username,long carimbotempo, int gostos, Comentario comentarios, TipoEvento tipoEvento, Date data, String local, boolean entrada, String status) {
        super(username,carimbotempo,gostos,comentarios);
        TipoEvento = tipoEvento;
        Data = data;
        this.local = local;
        this.entrada = entrada;
        this.status = status;
    }

    /**
     * Obtém a data do evento.
     *
     * @return A data do evento.
     */
    public Date getData() {
        return Data;
    }

    /**
     * Obtém o local do evento.
     *
     * @return O local do evento.
     */
    public String getLocal() {
        return local;
    }

    /**
     * Obtém o status atual da postagem.
     *
     * @return O status atual da postagem.
     */
    public String getStatus() {
        return status;
    }

    /**
     * Obtém o tipo de evento da postagem.
     *
     * @return O tipo de evento da postagem.
     */
    public TipoEvento getTipoEvento() {
        return TipoEvento;
    }
    public void display(){
        super.display();
        System.out.println("Tipo de Evento: " +getTipoEvento());
        System.out.println("Data: " +Data);
        System.out.println("Local: "+local);
        System.out.println("Entrada: "+entrada);
        System.out.println("Status: "+status);
    }
}
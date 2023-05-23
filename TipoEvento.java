/**
 * Enumeração que representa os diferentes tipos de eventos em uma postagem.
 */
public enum TipoEvento {
    Sentod("Sentod"),
    Festa("Festa"),
    Passeio("Passeio"),
    Visita_Estudo("Visita de Estudo");

    private String descricao; // Descrição do tipo de evento

    /**
     * Construtor da enumeração TipoEvento.
     *
     * @param descricao A descrição do tipo de evento.
     */
    TipoEvento(String descricao) {
        this.descricao = descricao;
    }

    /**
     * Obtém a descrição do tipo de evento.
     *
     * @return A descrição do tipo de evento.
     */
    public String getDescricao() {
        return descricao;
    }
}
/**
 * Representa uma postagem de mensagem na rede social.
 */
public class PedradaMensagem extends Pedrada {
    private String textoMensagem; // texto da mensagem

    /**
     * Construtor da classe PedradaMensagem.
     *
     * @param username        O nome de usuário do autor da postagem.
     * @param carimbotempo    O carimbo de data/hora da postagem.
     * @param gostos          A quantidade de pessoas que gostaram da postagem.
     * @param comentarios     A lista de comentários nesta postagem.
     * @param textoMensagem   O texto da mensagem.
     */
    public PedradaMensagem(String username, long carimbotempo, int gostos, Comentario comentarios, String textoMensagem) {
        super(username, carimbotempo, gostos, comentarios);
        this.textoMensagem = textoMensagem;
    }

    /**
     * Obtém o texto da mensagem.
     *
     * @return O texto da mensagem.
     */
    public String getTextoMensagem() {
        return textoMensagem;
    }
}
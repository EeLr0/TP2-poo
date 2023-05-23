/**
 * Representa uma postagem de foto na rede social.
 */
public class PedradaFoto extends Pedrada {
    private String nomeficheiro; // nome do arquivo da foto (ex: nomedoficheiro.jpg ou .png)
    private String legenda; // descrição da foto

    /**
     * Construtor da classe PedradaFoto.
     *
     * @param username      O nome de usuário do autor da postagem.
     * @param nomeficheiro  O nome do arquivo da foto.
     * @param legenda       A legenda/descrição da foto.
     */
    public PedradaFoto(String username,long carimbotempo, int gostos, Comentario comentarios, String nomeficheiro, String legenda) {
        super(username, carimbotempo, gostos,comentarios);
        this.nomeficheiro = nomeficheiro;
        this.legenda = legenda;
    }

    /**
     * Obtém o nome do arquivo da foto.
     *
     * @return O nome do arquivo da foto.
     */
    public String getNomeficheiro() {
        return nomeficheiro;
    }

    /**
     * Obtém a legenda/descrição da foto.
     *
     * @return A legenda/descrição da foto.
     */
    public String getLegenda() {
        return legenda;
    }
}
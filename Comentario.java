import java.util.Date;

/**
 * Classe que representa um comentário em uma postagem.
 */
public class Comentario {
    private String texto; // Texto do comentário
    private Date hora; // Hora do comentário
    private int gostos; // Quantidade de curtidas do comentário

    /**
     * Construtor da classe Comentario.
     *
     * @param texto O texto do comentário.
     * @param hora A hora do comentário.
     */
    public Comentario(String texto, Date hora) {
        this.texto = texto;
        this.hora = hora;
        this.gostos = 0;
    }

    /**
     * Responde a um comentário com um novo comentário.
     *
     * @param texto O texto do novo comentário.
     * @param hora A hora do novo comentário.
     */
    private void responder(String texto, Date hora) {
        Comentario resposta = new Comentario(texto, hora);
    }

    /**
     * Incrementa a quantidade de curtidas do comentário.
     */
    public void gostos() {
        gostos++;
    }

    /**
     * Decrementa a quantidade de curtidas do comentário.
     * Caso a quantidade de curtidas seja menor que 0, não realiza a decrementação.
     */
    public void tragostos() {
        if (gostos > 0) {
            gostos--;
        }
    }
}
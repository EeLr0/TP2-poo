/**
 * Classe abstrata que representa uma pedrada, que é uma postagem na rede social.
 */
public abstract class Pedrada {
    private static int nextID = 1;
    private int id; // id da postagem do texto ou foto ou evento
    private String username; // o nome de usuário do autor
    private long carimbotempo; // um carimbo de data/hora (hora da postagem)
    private int gostos; // quantas pessoas gostam deste post
    private Comentario comentarios; // uma lista de comentários nesta postagem por outros usuários

    /**
     * Construtor da classe Pedrada.
     *
     * @param username     O nome de usuário do autor.
     * @param carimbotempo O carimbo de data/hora da postagem.
     * @param gostos       O número de gostos da postagem.
     * @param comentarios  Os comentários da postagem.
     */
    public Pedrada(String username, long carimbotempo, int gostos, Comentario comentarios) {
        this.id = nextID++;
        this.username = username;
        this.carimbotempo = carimbotempo;
        this.gostos = gostos;
        this.comentarios = comentarios;
    }

    /**
     * Método para incrementar o número de gostos da postagem.
     */
    public void gostos() {
        gostos++;
    }

    /**
     * Método para decrementar o número de gostos da postagem.
     *
     * @param username O nome de usuário do autor que está retirando o gosto.
     * @throws MesmoUsuarioException Se o mesmo usuário tentar retirar o gosto duas vezes.
     */
    public void tragostos(String username) throws MesmoUsuarioException {
        if (gostos > 0) {
            if (this.username.equals(username)) {
                throw new MesmoUsuarioException("O mesmo usuário não pode retirar os gostos duas vezes");
            }
            gostos--;
        }
    }

    /**
     * Método para obter o comentário mais recente da postagem.
     *
     * @return O comentário mais recente da postagem.
     */
    public Comentario masriola() {
        return masriola();
    }

    /**
     * Método para exibir a postagem.
     */
    public void display() {
        // lógica para exibir a postagem
        System.out.println("ID: "+id);
        System.out.println("Autor: "+username);
        System.out.println("Carimbo de Tempo: " +carimbotempo);
        System.out.println("Gostos: " +gostos);
        System.out.println("Comentários: " +comentarios);
    }

    /**
     * Método para obter o carimbo de data/hora da postagem.
     *
     * @return O carimbo de data/hora da postagem.
     */
    public long getCarimboTempo() {
        return carimbotempo;
    }

    /**
     * Exceção personalizada para quando o mesmo usuário tentar retirar o gosto duas vezes.
     */
    class MesmoUsuarioException extends Exception {
        public MesmoUsuarioException(String s) {
            super(s);
        }
    }
}

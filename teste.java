import java.util.Date;

public class teste {
    public static void main(String[] args) throws Pedrada.MesmoUsuarioException {
        // Criando instâncias de Comentario
        Comentario comentario1 = new Comentario("Ótima foto!", new Date());
        Comentario comentario2 = new Comentario("Parabéns pelo evento!", new Date());

        // Criando instância de PedradaFoto
        PedradaFoto foto = new PedradaFoto("john_doe", new Date().getTime(), 0, comentario1, "foto.jpg", "Linda paisagem");

        // Criando instância de PedradaEvento
        PedradaEvento evento = new PedradaEvento("mary_smith", new Date().getTime(), 0, comentario2, TipoEvento.Festa, new Date(), "Local do evento", true, "Confirmado");

        // Criando instância de PedradaMensagem
        PedradaMensagem mensagem = new PedradaMensagem("jane_doe", new Date().getTime(), 0, null, "Olá a todos!");

        // Criando instância de Riola
        Riola riola = new Riola();

        // Adicionando as pedradas ao Riola
        riola.addPedrada(foto);
        riola.addPedrada(evento);
        riola.addPedrada(mensagem);

        // Exibindo o feed de notícias
        riola.show();
    }
}

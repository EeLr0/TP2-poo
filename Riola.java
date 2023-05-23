import java.awt.*;
import java.util.ArrayList;
import java.util.Date;

/**
 * Classe que implementa o feed de notícias da rede social, exibindo as postagens feitas nas últimas 24 horas
 * e que não foram visualizadas por um membro da rede.
 */
public class Riola {
    private ArrayList<Pedrada> pedradas; // Lista de postagens

    /**
     * Construtor da classe Riola.
     * Inicializa a lista de postagens.
     */
    public Riola() {
        this.pedradas = new ArrayList<Pedrada>();
    }

    /**
     * Adiciona uma nova postagem ao feed de notícias.
     *
     * @param pedrada A postagem a ser adicionada.
     */
    public void addPedrada(Pedrada pedrada) {
        pedradas.add(pedrada);
    }

    /**
     * Exibe as postagens que foram feitas nas últimas 24 horas e que não foram visualizadas.
     */
    public void show() {
        Date dataAtual = new Date();

        for (Pedrada pedrada : pedradas) {
            if (dataAtual.getTime() - pedrada.getCarimboTempo() <= 24 * 60 * 60 * 1000) {
                pedrada.display();
                System.out.println();
            }
        }
    }
}

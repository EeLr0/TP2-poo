import java.util.*;

public interface ModerarGrupo {
    /**Interface que define as opcoes que o moderador pode escolher*/
    default void criar(){
        PedradaDigital gp = new PedradaDigital();
        Grupo grupo = new Grupo();
        ArrayList<Isecmarini>membro = new ArrayList<>();
        Map<Grupo,ArrayList<Isecmarini>> grupos = new HashMap<>();
        grupos.put(grupo,membro);
        gp.setGrupos(grupos);
    }
    /**
     *Metodo para apagar grupos
     * */
    default void apagar(PedradaDigital grupos){
        Map<Grupo,ArrayList<Isecmarini>>aux = new HashMap<>();
        aux = grupos.getGrupos();
        aux.get(nomeGrupo);
        aux.replace(nomeGrupo);
        grupos.setGrupos(aux);
    }
    void adicionarMembro();
    void muteMembro();
    void removerMembro();
    default void moderar(){
        System.out.println();
    }
}

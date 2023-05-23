public class Professor extends Isecmarini implements ModerarGrupo{
    /**
     *Classe que define os professores na rede
     */
    //area que o professor pertence
    private String area;
    //grau que o professor possui
    private String grau;
    //departamento da instituiucoa que o professor pewrtence
    private String departamento;

    /**
     * Metodo construtor da classe professor
     * */
    public Professor(String username, String email, String nome, String apelido, String pseudonimo,
                     String alcunha, String password, String area, String grau, String departamento) {
        super(username, email, nome, apelido, pseudonimo, alcunha, password);
        this.area = area;
        this.grau = grau;
        this.departamento = departamento;
    }
}

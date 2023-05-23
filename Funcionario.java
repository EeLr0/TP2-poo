public class Funcionario extends Isecmarini{
    /**
     * Classe que define os funcionarios da instituicao na rede
     * */
    private String funcao;

    public Funcionario(String username, String email, String nome, String apelido,
                       String pseudonimo, String alcunha, String password, String funcao) {
        super(username, email, nome, apelido, pseudonimo, alcunha, password);
        this.funcao = funcao;
    }
}

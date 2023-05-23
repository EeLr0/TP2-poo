import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
/**
 * Classe abstrata que implementa os dados dos utilizadores da rede pedrada digital
 */
public abstract class Isecmarini implements MembroRede{
    //nome que sera mostrado a outros usuarios
    protected String username;
    //email que sera usado para cadastro
    private String email;
    //nome do usario
    private String nome;
    //apelido do utilizador
    private String apelido;
    //nome ficticio do utilizador
    private String pseudonimo;
    //alcunha do utilizador
    private String alcunha;
    //chave do qual o utilizador deve usar para entrar na plataforma
    private String password;
    //visiblidade para outros usuarios true=visivel/false=nao visivel
    private boolean visivel;
    //topicos que a pessoa esta interessada
    protected Set<Interesse>interesses;

    public Isecmarini(String username, String email, String nome, String apelido, String pseudonimo, String alcunha,
                      String password) {
        this.username = username;
        this.email = email;
        this.nome = nome;
        this.apelido = apelido;
        this.pseudonimo = pseudonimo;
        this.alcunha = alcunha;
        this.password = password;
        this.visivel = true;
        this.interesses = new HashSet<Interesse>() {
        };
    }
    public Isecmarini(){
        this.visivel = true;
    }
    /**
     * Metodo para definir uma nova palavra passe na conta
     * */
    public void resetpassword(){
        Scanner input = new Scanner(System.in);
        System.out.println("Introduza novo password: ");
        this.password = input.next();
        System.out.println("Palavra passe alterada com sucesso");
       /* try {

        }catch (){}*/
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public void setPseudonimo(String pseudonimo) {
        this.pseudonimo = pseudonimo;
    }

    public void setAlcunha(String alcunha) {
        this.alcunha = alcunha;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    //metodo que permite ver perfil(perfil proprio ou outro membro?)
    public void verPerfil(){
        System.out.print(username);
        if (this.visivel==true){
            System.out.println("Visivel");
        }
        else {
            System.out.println("Nao visivel");
        }
        for (Interesse i : interesses){
            System.out.println(i);
        }
    }

    /**
     * Metodo que define a visiblidadde do perfil*/
    public void definirVisiblidade(){
        setVisivel(!visivel);
    }
    /**
     * Metodo que permite mudar a visiblidade do perfil
     * */
    public void setVisivel(boolean visivel) {
        this.visivel = visivel;
    }
}

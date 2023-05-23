import java.util.*;

public class PedradaDigital {
    private Set<Isecmarini>comunidade;
    private ArrayList<Pedrada>pedradas;
    private Map<Grupo,ArrayList<Isecmarini>>grupos;
    private Evento eventos;

    public void setGrupos(Map<Grupo, ArrayList<Isecmarini>> grupos) {
        this.grupos = grupos;
    }

    public Map<Grupo, ArrayList<Isecmarini>> getGrupos() {
        return grupos;
    }
    /**
     * metodo construtor da classe PedradaDigital
     * */
    public PedradaDigital(Evento eventos) {
        this.comunidade = new HashSet<Isecmarini>();
        this.pedradas = new ArrayList<Pedrada>();
        this.grupos = new HashMap<>();
        this.eventos = eventos;
    }
    public PedradaDigital(){
    }

    /**
     * Metodo que implementa a funcao de login no sistema
     * */
    public void signIn(){
        //try {
        Scanner input = new Scanner(System.in);
        System.out.println("Email: ");
        String password = input.next();
        System.out.println("Password: ");
        //}catch(){}
    }
    /**
     * Metodo que implmenta a funcao de sair do sistema
     * */
    public void signOff(){
         System.exit(0);
    }
    /**
     * Metodo que implementa o cadastro no sistema
     * */
    public void signUp(){
        Isecmarini signUpData = new Isecmarini() {};
        Scanner input = new Scanner(System.in);
        System.out.println("Username: ");
        signUpData.username = input.next();
        System.out.println("Email: ");
        signUpData.setEmail(input.next());
        System.out.println("Nome: ");
        signUpData.setNome(input.next());
        System.out.println("Apelido: ");
        signUpData.setApelido(input.next());
        System.out.println("Pseudonimo: ");
        signUpData.setPseudonimo(input.next());
        System.out.println("Alcunha: ");
        signUpData.setAlcunha(input.next());
        System.out.println("Password: ");
        signUpData.setPassword(input.next());
        comunidade.add(signUpData);
    }
}

import java.time.LocalDateTime;
/**
 * Classe que define os estudantes da rede
 */
public class Estudante extends Isecmarini implements GestorEvento{
    private int codigo;
    private String curso;
    private LocalDateTime anoMatricula;
    private int anoCurso;
    private VidaEstudante status;

    public Estudante(String username, String email, String nome, String apelido, String pseudonimo, String alcunha,
                     String password,
                     int codigo, String curso, LocalDateTime anoMatricula, int anoCurso, VidaEstudante status) {
        super(username, email, nome, apelido, pseudonimo, alcunha, password);
        this.codigo = codigo;
        this.curso = curso;
        this.anoMatricula = anoMatricula;
        this.anoCurso = anoCurso;
        this.status = status;
    }

    /**
     * Metodo para mandar pedradas para a turma
     * */
    public void mandaPaTurma(){
        //
    }
}

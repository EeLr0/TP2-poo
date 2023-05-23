import java.time.LocalDateTime;
/**
 * Classe que representa ex-estudantes da universidade
 * */
public class Alumni extends Estudante{
    private String trabalho;
    private String funcao;
    private String email;

    public Alumni(String username, String email, String nome, String apelido, String pseudonimo, String alcunha,
                  String password, int codigo, String curso, LocalDateTime anoMatricula, int anoCurso, VidaEstudante status) {
        super(username, email, nome, apelido, pseudonimo, alcunha, password, codigo, curso, anoMatricula, anoCurso, status);
    }
}

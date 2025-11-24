package pessoa.com.chicodev.pessoa.model.resource;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PessoaDadoSenvivelResource {

    private String cpf;
    private String rg;
    private String dataNascimento;
    private String localNascimento;

    public PessoaDadoSenvivelResource() {

    }

    public PessoaDadoSenvivelResource(String cpf, String rg) {

    }
}

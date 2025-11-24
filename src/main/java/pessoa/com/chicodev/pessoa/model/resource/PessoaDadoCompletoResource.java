package pessoa.com.chicodev.pessoa.model.resource;

import lombok.Getter;
import lombok.Setter;
import java.util.UUID;

@Getter
@Setter
public class PessoaDadoCompletoResource {

    private UUID pessoaId;
    private PessoaDadoSenvivelResource pessoaDadoSensivelResource;
    private PessoaDadoContatoResource pessoaDadoContatoResource;
    private PessoaDadoEnderecoResource pessoaDadoEnderecoResource;

    public PessoaDadoCompletoResource() {

    }

}

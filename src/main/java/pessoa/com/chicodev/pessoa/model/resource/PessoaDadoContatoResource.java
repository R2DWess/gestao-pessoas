package pessoa.com.chicodev.pessoa.model.resource;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PessoaDadoContatoResource {

    private String telefone;
    private String email;

    public PessoaDadoContatoResource() {
    }

    public PessoaDadoContatoResource(String telefone, String email) {
        this.telefone = telefone;
        this.email = email;
    }

}

package pessoa.com.chicodev.pessoa.model.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PessoaDadoContatoDTO {

    private String telefone;
    private String email;

    public PessoaDadoContatoDTO() {
    }

    public PessoaDadoContatoDTO(String telefone, String email) {
        this.telefone = telefone;
        this.email = email;
    }

}

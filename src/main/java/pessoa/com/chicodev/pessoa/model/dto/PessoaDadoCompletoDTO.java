package pessoa.com.chicodev.pessoa.model.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
public class PessoaDadoCompletoDTO {

    private UUID pessoaId;
    private PessoaDadoContatoDTO pessoaDadoContatoDTO;
    private PessoaDadoEnderecoDTO pessoaDadoEnderecoDTO;
    private PessoaDadoSensivelDTO pessoaDadoSensivelDTO;

    public PessoaDadoCompletoDTO() {

    }


}

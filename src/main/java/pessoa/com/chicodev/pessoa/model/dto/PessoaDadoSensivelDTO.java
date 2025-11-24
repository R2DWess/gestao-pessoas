package pessoa.com.chicodev.pessoa.model.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PessoaDadoSensivelDTO {

    private String cpf;
    private String rg;
    private String dataNascimento;
    private String localNascimento;

    public PessoaDadoSensivelDTO() {
    }

    public PessoaDadoSensivelDTO(String cpf, String rg, String dataNascimento, String localNascimento) {
        this.cpf = cpf;
        this.rg = rg;
        this.dataNascimento = dataNascimento;
        this.localNascimento = localNascimento;
    }

}

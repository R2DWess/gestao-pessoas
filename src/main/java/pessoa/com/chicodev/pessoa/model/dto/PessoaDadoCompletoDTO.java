package pessoa.com.chicodev.pessoa.model.dto;

import pessoa.com.chicodev.pessoa.model.resource.PessoaDadoEnderecoResource;
import pessoa.com.chicodev.pessoa.model.resource.PessoaDadoSenvivelResource;

public class PessoaDadoCompletoDTO {

    private PessoaDadoEnderecoResource pessoaDadoEnderecoResource;
    private PessoaDadoContatoDTO pessoaDadoContatoDTO;
    private PessoaDadoSenvivelResource pessoaDadoSenvivelResource;

    public PessoaDadoCompletoDTO() {

    }

    public PessoaDadoEnderecoResource getPessoaDadoEnderecoResource() {
        return pessoaDadoEnderecoResource;
    }

    public void setPessoaDadoEnderecoResource(PessoaDadoEnderecoResource pessoaDadoEnderecoResource) {
        this.pessoaDadoEnderecoResource = pessoaDadoEnderecoResource;
    }

    public PessoaDadoContatoDTO getPessoaDadoContatoDTO() {
        return pessoaDadoContatoDTO;
    }

    public void setPessoaDadoContatoDTO(PessoaDadoContatoDTO pessoaDadoContatoDTO) {
        this.pessoaDadoContatoDTO = pessoaDadoContatoDTO;
    }

    public PessoaDadoSenvivelResource getPessoaDadoSenvivelResource() {
        return pessoaDadoSenvivelResource;
    }

    public void setPessoaDadoSenvivelResource(PessoaDadoSenvivelResource pessoaDadoSenvivelResource) {
        this.pessoaDadoSenvivelResource = pessoaDadoSenvivelResource;
    }
}

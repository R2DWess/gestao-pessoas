package pessoa.com.chicodev.pessoa.model.resource;

import java.util.UUID;

public class PessoaDadoCompletoResource {

    private UUID pessoaId;
    private PessoaDadoSenvivelResource pessoaDadoSenvivelResource;
    private PessoaDadoContatoResource pessoaDadoContatoResource;
    private PessoaDadoEnderecoResource pessoaDadoEnderecoResource;

    public PessoaDadoCompletoResource() {

    }

    public UUID getPessoaId() {
        return pessoaId;
    }

    public void setPessoaId(UUID pessoaId) {
        this.pessoaId = pessoaId;
    }

    public PessoaDadoSenvivelResource getPessoaDadoSenvivelResource() {
        return pessoaDadoSenvivelResource;
    }

    public void setPessoaDadoSenvivelResource(PessoaDadoSenvivelResource pessoaDadoSenvivelResource) {
        this.pessoaDadoSenvivelResource = pessoaDadoSenvivelResource;
    }

    public PessoaDadoContatoResource getPessoaContatoResource() {
        return pessoaDadoContatoResource;
    }

    public void setPessoaContatoResource(PessoaDadoContatoResource pessoaDadoContatoResource) {
        this.pessoaDadoContatoResource = pessoaDadoContatoResource;
    }

    public PessoaDadoEnderecoResource getPessoaDadoEnderecoResource() {
        return pessoaDadoEnderecoResource;
    }

    public void setPessoaDadoEnderecoResource(PessoaDadoEnderecoResource pessoaDadoEnderecoResource) {
        this.pessoaDadoEnderecoResource = pessoaDadoEnderecoResource;
    }
}

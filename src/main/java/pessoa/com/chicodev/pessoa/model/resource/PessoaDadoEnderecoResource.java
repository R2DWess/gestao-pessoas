package pessoa.com.chicodev.pessoa.model.resource;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PessoaDadoEnderecoResource {

    private String rua;
    private String numero;
    private String casa;
    private String cidade;
    private String estado;
    private String cep;

    public PessoaDadoEnderecoResource() {
    }

    public PessoaDadoEnderecoResource(String rua, String numero, String casa, String cidade, String estado, String cep) {
        this.rua = rua;
        this.numero = numero;
        this.casa = casa;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
    }
}

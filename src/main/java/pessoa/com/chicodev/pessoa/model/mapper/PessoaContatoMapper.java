package pessoa.com.chicodev.pessoa.model.mapper;

import org.springframework.stereotype.Component;
import pessoa.com.chicodev.pessoa.model.dto.PessoaDadoContatoDTO;
import pessoa.com.chicodev.pessoa.model.resource.PessoaDadoContatoResource;

@Component
public class PessoaContatoMapper {

    public PessoaDadoContatoDTO paraContatoDTO (PessoaDadoContatoResource pessoaDadoContatoResource) {
        PessoaDadoContatoDTO dadoContatoDTO = new PessoaDadoContatoDTO();
        dadoContatoDTO.setTelefone(pessoaDadoContatoResource.getTelefone());
        dadoContatoDTO.setEmail(pessoaDadoContatoResource.getEmail());
        return dadoContatoDTO;
    }

}

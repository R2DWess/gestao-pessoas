package pessoa.com.chicodev.pessoa.model.mapper;

import org.springframework.stereotype.Component;
import pessoa.com.chicodev.pessoa.model.dto.PessoaDadoCompletoDTO;
import pessoa.com.chicodev.pessoa.model.resource.PessoaDadoCompletoResource;
import pessoa.com.chicodev.pessoa.model.resource.PessoaDadoEnderecoResource;

@Component
public class PessoaDadoCompletoMapper {


    public PessoaDadoCompletoDTO paraDadoCompletoDTO (PessoaDadoCompletoResource pessoaDadoCompletoResource) {
        PessoaDadoCompletoDTO dadoCompletoDTO = new PessoaDadoCompletoDTO();

        dadoCompletoDTO.getPessoaDadoContatoDTO(pessoaDadoCompletoResource.getPessoaContatoResource());
    }
}

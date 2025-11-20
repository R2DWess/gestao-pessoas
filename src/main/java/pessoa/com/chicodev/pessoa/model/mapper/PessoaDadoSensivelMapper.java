package pessoa.com.chicodev.pessoa.model.mapper;

import org.springframework.stereotype.Component;
import pessoa.com.chicodev.pessoa.model.dto.PessoaDadoSensivelDTO;
import pessoa.com.chicodev.pessoa.model.resource.PessoaDadoSenvivelResource;

@Component
public class PessoaDadoSensivelMapper {

    public PessoaDadoSensivelDTO paraDadoSensivelDTO (PessoaDadoSenvivelResource pessoaDadoSenvivelResource) {
        PessoaDadoSensivelDTO dadoSensivelDTO = new PessoaDadoSensivelDTO();
        dadoSensivelDTO.setCpf(pessoaDadoSenvivelResource.getCpf());
        dadoSensivelDTO.setRg(pessoaDadoSenvivelResource.getRg());
        return dadoSensivelDTO;
    }
}

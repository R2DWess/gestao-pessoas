package pessoa.com.chicodev.pessoa.model.mapper;

import org.springframework.stereotype.Component;
import pessoa.com.chicodev.pessoa.model.dto.PessoaDadoCompletoDTO;
import pessoa.com.chicodev.pessoa.model.resource.PessoaDadoCompletoResource;

@Component
public class PessoaDadoCompletoMapper {

    private final PessoaDadoSensivelMapper sensivelMapper;
    private final PessoaContatoMapper contatoMapper;
    private final PessoaDadoEnderecoMapper enderecoMapper;

    public PessoaDadoCompletoMapper(PessoaDadoSensivelMapper sensivelMapper,
                                    PessoaContatoMapper contatoMapper,
                                    PessoaDadoEnderecoMapper enderecoMapper) {
        this.sensivelMapper = sensivelMapper;
        this.contatoMapper = contatoMapper;
        this.enderecoMapper = enderecoMapper;
    }

    public PessoaDadoCompletoDTO paraDadoCompletoDTO(PessoaDadoCompletoResource pessoaDadoCompletoResource) {

        PessoaDadoCompletoDTO dadoCompletoDTO = new PessoaDadoCompletoDTO();

        dadoCompletoDTO.setPessoaId(pessoaDadoCompletoResource.getPessoaId());

        var sensivelRes = pessoaDadoCompletoResource.getPessoaDadoSensivelResource();
        dadoCompletoDTO.setPessoaDadoSensivelDTO(sensivelMapper.paraDadoSensivelDTO(sensivelRes));

        var contatoRes = pessoaDadoCompletoResource.getPessoaDadoContatoResource();
        dadoCompletoDTO.setPessoaDadoContatoDTO(contatoMapper.paraContatoDTO(contatoRes));

        var enderecoRes = pessoaDadoCompletoResource.getPessoaDadoEnderecoResource();
        dadoCompletoDTO.setPessoaDadoEnderecoDTO(enderecoMapper.paraDadoEnderecoDTO(enderecoRes));

        return dadoCompletoDTO;
    }
}
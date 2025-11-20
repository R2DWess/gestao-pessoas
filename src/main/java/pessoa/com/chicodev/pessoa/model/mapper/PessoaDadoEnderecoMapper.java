package pessoa.com.chicodev.pessoa.model.mapper;

import org.springframework.stereotype.Component;
import pessoa.com.chicodev.pessoa.model.dto.PessoaDadoEnderecoDTO;
import pessoa.com.chicodev.pessoa.model.resource.PessoaDadoEnderecoResource;

@Component
public class PessoaDadoEnderecoMapper {

    public PessoaDadoEnderecoDTO paraDadoEnderecoDTO (PessoaDadoEnderecoResource pessoaDadoEnderecoResource){
        PessoaDadoEnderecoDTO dadoEnderecoDTO = new PessoaDadoEnderecoDTO();

        dadoEnderecoDTO.setCasa(pessoaDadoEnderecoResource.getCasa());
        dadoEnderecoDTO.setRua(pessoaDadoEnderecoResource.getRua());
        dadoEnderecoDTO.setNumero(pessoaDadoEnderecoResource.getNumero());
        dadoEnderecoDTO.setCidade(pessoaDadoEnderecoResource.getCidade());
        dadoEnderecoDTO.setEstado(pessoaDadoEnderecoResource.getEstado());
        dadoEnderecoDTO.setCep(pessoaDadoEnderecoResource.getCep());
        return dadoEnderecoDTO;
    }
}

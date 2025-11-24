package pessoa.com.chicodev.pessoa.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pessoa.com.chicodev.pessoa.model.dto.PessoaDadoCompletoDTO;
import pessoa.com.chicodev.pessoa.model.mapper.PessoaDadoCompletoMapper;
import pessoa.com.chicodev.pessoa.model.resource.PessoaDadoCompletoResource;
import pessoa.com.chicodev.pessoa.service.PessoaService;

@RestController
@RequestMapping("/pessoas")
public class PessoaController {

    private final PessoaService pessoaService;
    private final PessoaDadoCompletoMapper dadoPessoaCompletoMapper;

    public PessoaController(PessoaService pessoaService, PessoaDadoCompletoMapper dadoPessoaCompletoMapper) {
        this.pessoaService = pessoaService;
        this.dadoPessoaCompletoMapper = dadoPessoaCompletoMapper;
    }

    @PostMapping("criar")
    public PessoaDadoCompletoDTO createPerson(@RequestBody PessoaDadoCompletoDTO pessoaDadoCompletoDTO) {

        PessoaDadoCompletoResource resourceToSave = paraDadoCompletoResource(pessoaDadoCompletoDTO);

        PessoaDadoCompletoResource savedResource = pessoaService.create(resourceToSave);

        return dadoPessoaCompletoMapper.paraDadoCompletoDTO(savedResource);
    }

    private PessoaDadoCompletoResource paraDadoCompletoResource (PessoaDadoCompletoDTO dto) {
        PessoaDadoCompletoResource resource = new PessoaDadoCompletoResource();
        resource.setPessoaId(dto.getPessoaId());
        return resource;
    }
}
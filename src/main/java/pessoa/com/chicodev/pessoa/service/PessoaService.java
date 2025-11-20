package pessoa.com.chicodev.pessoa.service;

import org.springframework.web.bind.annotation.RestController;
import pessoa.com.chicodev.pessoa.model.resource.PessoaDadoCompletoResource;

import java.util.List;
import java.util.UUID;

@RestController
public interface PessoaService {
    PessoaDadoCompletoResource create(PessoaDadoCompletoResource pessoaDadoCompletoResource);

    List<PessoaDadoCompletoResource> findAll();

    PessoaDadoCompletoResource findById(UUID pessoaId);

    PessoaDadoCompletoResource delete(UUID pessoaId);
}

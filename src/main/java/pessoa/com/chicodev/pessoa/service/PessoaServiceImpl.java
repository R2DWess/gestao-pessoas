package pessoa.com.chicodev.pessoa.service;

import org.springframework.stereotype.Service;
import pessoa.com.chicodev.pessoa.model.resource.PessoaDadoCompletoResource;

import java.util.*;

@Service
public class PessoaServiceImpl implements PessoaService {

    private final Map<UUID, PessoaDadoCompletoResource> storage = new HashMap<>();

    @Override
    public PessoaDadoCompletoResource create(PessoaDadoCompletoResource pessoaDadoCompletoResource) {
        UUID newId = UUID.randomUUID();
        pessoaDadoCompletoResource.setPessoaId(newId);
        storage.put(newId, pessoaDadoCompletoResource);
        return pessoaDadoCompletoResource;
    }

    @Override
    public List<PessoaDadoCompletoResource> findAll() {
        return new ArrayList<>(storage.values());
    }

    @Override
    public PessoaDadoCompletoResource findById(UUID pessoaId) {
        return storage.get(pessoaId);
    }

    @Override
    public PessoaDadoCompletoResource delete(UUID pessoaId) {
        return storage.remove(pessoaId);
    }
}

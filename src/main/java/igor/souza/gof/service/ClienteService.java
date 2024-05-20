package igor.souza.gof.service;

import igor.souza.gof.model.Cliente;
import org.springframework.stereotype.Service;

@Service
public interface ClienteService {

    Iterable<Cliente> buscarTodos();

    Cliente buscarPorId(Long id);

    void inserir(Cliente cliente);

    void atualizar(Long id, Cliente cliente);

    void deletar(Long id);
}

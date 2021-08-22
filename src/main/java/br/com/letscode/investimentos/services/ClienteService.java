package br.com.letscode.investimentos.services;

import br.com.letscode.investimentos.exceptions.ClienteNaoEncontradoException;
import br.com.letscode.investimentos.models.Cliente;
import br.com.letscode.investimentos.repositories.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {

    private final ClienteRepository repository;

    @Autowired
    public ClienteService(ClienteRepository clienteRepository){
        repository = clienteRepository;
    }

    public Cliente saveNewCliente(Cliente novoCliente) {
        return repository.save(novoCliente);
    }

    public Cliente getClienteById(Long clienteId){
        return repository.findById(clienteId).orElseThrow(ClienteNaoEncontradoException::new);
    }
}

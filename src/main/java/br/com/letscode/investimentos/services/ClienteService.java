package br.com.letscode.investimentos.services;

import br.com.letscode.investimentos.exceptions.ClienteNaoEncontradoException;
import br.com.letscode.investimentos.models.Cliente;
import br.com.letscode.investimentos.repositories.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {

    //aqui ele está chamando a interface, já que não podemos instanciar uma interface direto!
    private final ClienteRepository repository;

    @Autowired
    public ClienteService(ClienteRepository clienteRepository){
        this.repository = clienteRepository;
    }

    public Cliente saveNewCliente(Cliente novoCliente) {
        return repository.save(novoCliente);
    }

    public Cliente getClienteById(String clienteId){
        return repository.findById(clienteId).orElseThrow(ClienteNaoEncontradoException::new);
    }
}

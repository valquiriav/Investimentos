package br.com.letscode.investimentos.services;

import br.com.letscode.investimentos.dto.FundoDTO;
import br.com.letscode.investimentos.exceptions.FundoNaoEncontradoException;
import br.com.letscode.investimentos.models.Fundo;
import br.com.letscode.investimentos.repositories.FundoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FundoService {

    private final FundoRepository repository;

    @Autowired
    public FundoService(FundoRepository fundoRepository){
        repository = fundoRepository;
    }

    public Fundo saveNewFundo(Fundo novoFundo){
        return repository.save(novoFundo);
    }

    public Fundo getFundoById(Long fundoId){
        return repository.findById(fundoId).orElseThrow(FundoNaoEncontradoException::new);
    }

    //TODO
    public List<FundoDTO> getFundos() {
        return null;
    }
}

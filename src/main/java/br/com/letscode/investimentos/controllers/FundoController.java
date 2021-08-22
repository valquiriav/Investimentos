package br.com.letscode.investimentos.controllers;

import br.com.letscode.investimentos.dto.FundoDTO;
import br.com.letscode.investimentos.services.FundoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/fundo")
public class FundoController {

    private final FundoService service;
    @Autowired
    public FundoController(FundoService fundoService){
        service = fundoService;
    }

    @GetMapping("/listarFundos")
    public List<FundoDTO> getFundos(){
        return service.getFundos();
    }
}

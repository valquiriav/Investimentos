package br.com.letscode.investimentos.dto;

import br.com.letscode.investimentos.models.Fundo;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@Getter
@Setter
@AllArgsConstructor
public class FundoDTO {

    private Long fundo_id;

    private String fundoNome;

    private LocalDate dataInicio;

    private boolean fundoQualificado;

    private BigDecimal investimentoInicial;

    private BigDecimal saldoMinimo;

    private BigDecimal movimentacaoMinima;

    private BigDecimal tempoResgate;

    private BigDecimal pontuacaoRisco;

    public static FundoDTO of(Fundo fundo) {
        return new FundoDTO(fundo.getFundoId(), fundo.getFundoNome(), fundo.getDataInicio(),
                fundo.isFundoQualificado(), fundo.getInvestimentoInicial(),
                fundo.getSaldoMinimo(), fundo.getMovimentacaoMinima(),
                fundo.getTempoResgate(), fundo.getPontuacaoRisco());
    }

    public static List<FundoDTO> convertToList(List<Fundo> list){
        return list.stream()
                .map(FundoDTO::of)
                .collect(Collectors.toList());
    }
}

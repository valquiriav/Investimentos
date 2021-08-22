package br.com.letscode.investimentos.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity(name="fundo")
@Table(name="fundo")
public class Fundo {
    @Id
    @Column(name = "fundo_id", nullable = false)
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long fundoId;

    @Column(name = "fundo_nome")
    private String fundoNome;

    @Column(name = "data_inicio")
    private LocalDate dataInicio;

    @Column(name = "fundo_qualificado")
    private boolean fundoQualificado;

    @Column(name = "investimento_inicial")
    private BigDecimal investimentoInicial;

    @Column(name = "saldo_minimo")
    private BigDecimal saldoMinimo;

    @Column(name = "movimentacao_minima")
    private BigDecimal movimentacaoMinima;

    @Column(name = "tempo_resgate")
    private BigDecimal tempoResgate;

    @Column(name = "pontuacao_risco")
    private BigDecimal pontuacaoRisco;
}

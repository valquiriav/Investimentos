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
@Entity(name="cliente")
@Table(name="cliente")
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long fundoId;

    @Column(name = "cpf", nullable = false)
    private String cpf;

    @Column(name = "nome")
    private String clienteNome;

    @Column(name = "sobrenome")
    private String clienteSobrenome;

    @Column(name = "data_nascimento")
    private LocalDate dataNascimento;

    @Column(name = "idade")
    private int idade;

    @Column(name = "perfil_risco")
    private br.com.letscode.investimentos.models.PerfilRiscoEnums perfilRisco;

    @Column(name = "investidor_qualificado")
    private boolean investidorQualificado;

    @Column(name = "saldo")
    private BigDecimal saldo;

    @Column(name = "patrimonioTotal")
    private BigDecimal patrimonioTotal;
}

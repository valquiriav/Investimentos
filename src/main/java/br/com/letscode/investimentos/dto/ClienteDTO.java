package br.com.letscode.investimentos.dto;

import br.com.letscode.investimentos.models.Cliente;
import br.com.letscode.investimentos.models.PerfilRiscoEnums;
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
public class ClienteDTO {

    private Long cpf;

    private String clienteNome;

    private String clienteSobrenome;

    private LocalDate dataNascimento;

    private PerfilRiscoEnums perfilRisco;

    private boolean investidorQualificado;

    private BigDecimal saldo;

    private BigDecimal patrimonioTotal;


    public static ClienteDTO of(Cliente cliente) {
        return new ClienteDTO(cliente.getCpf(), cliente.getClienteNome(),
                 cliente.getClienteSobrenome(), cliente.getDataNascimento(),
                cliente.getPerfilRisco(), cliente.isInvestidorQualificado(),
                cliente.getSaldo(), cliente.getPatrimonioTotal());
    }

    public static List<ClienteDTO> convertToList(List<Cliente> list){
        return list.stream()
                .map(ClienteDTO::of)
                .collect(Collectors.toList());
    }
}

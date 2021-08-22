package br.com.letscode.investimentos.repositories;

import br.com.letscode.investimentos.models.Fundo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FundoRepository extends JpaRepository<Fundo, Long> {
}

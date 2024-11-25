package br.gov.sp.fatec.springtopicos20242.repository;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.gov.sp.fatec.springtopicos20242.entity.Chamado;

public interface ChamadoRepository extends JpaRepository<Chamado, Long>{

    public List<Chamado> findByTituloContainsAndDataHoraCadastroGreaterThanAndDataHoraFinalizacaoIsNull(String titulo, LocalDateTime dataHora);
    
    public List<Chamado> findByDataHoraCadastroGreaterThanAndEstimativaGreaterThanAndDataHoraFinalizacaoIsNull(LocalDateTime dataHora, Float estimativa);

}

package br.gov.sp.fatec.springtopicos20242.repository;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

import br.gov.sp.fatec.springtopicos20242.entity.Alerta;

public interface AlertaRepository extends CrudRepository<Alerta, Long>{

    public List<Alerta> findByMensagemContainsAndDataHoraVerificacaoGreaterThan(String mensagem, LocalDateTime dataHoraVerificacao);

    public List<Alerta> findByDataHoraGeracaoGreaterThanAndNivelLessThan(LocalDateTime dataHoraGeracao, Integer nivel);
    
}

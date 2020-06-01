package com.curso.pontointeligente.api.repositories;

import java.util.List;

import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.curso.pontointeligente.api.entities.Lancamento;

@Transactional(readOnly = true)
@NamedQueries({
	@NamedQuery(name = "LancamentoRepository.findByFuncionarioId",
			query = "SELECT lanc FROM Lancamento lanc WHERE lanc.funcionario.id = :funcionarioId")})
public interface LancamentoRepository extends JpaRepository<Lancamento, Long> {
	
// Neste exemplo o spring não vai conseguir criar a query pela convenção. Então a query deve ser especificada como namedquery (jpql)
	
	List<Lancamento> findByFuncionarioId(@Param("funcionarioId") Long funcionarioId);
	
	Page<Lancamento> findByFuncionarioId(@Param("funcionarioId") Long funcionarioId, Pageable pageable);
	
	
}

package com.renatosantana.demoacmeap.repository;

import java.util.List;
import java.util.Optional;

import com.renatosantana.demoacmeap.domain.Cliente;
import com.renatosantana.demoacmeap.domain.Instalacao;

import org.springframework.data.jpa.repository.JpaRepository;

public interface InstalacaoRepository extends JpaRepository<Instalacao, Long> {

    public Optional<Instalacao> findByCodigo(String codigo);

    public List<Instalacao> findByCliente(Cliente cliente);

}
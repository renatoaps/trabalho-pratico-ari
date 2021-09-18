package com.renatosantana.demoacmeap.repository;

import java.util.List;
import java.util.Optional;

import com.renatosantana.demoacmeap.domain.Fatura;
import com.renatosantana.demoacmeap.domain.Instalacao;

import org.springframework.data.jpa.repository.JpaRepository;

public interface FaturaRepository extends JpaRepository<Fatura, Long> {

    public Optional<Fatura> findByCodigo(String codigo);

    public List<Fatura> findByInstalacao(Instalacao instalacao);

}
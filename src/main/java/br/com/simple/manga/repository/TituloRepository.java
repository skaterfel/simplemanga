package br.com.simple.manga.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.simple.manga.model.Titulo;

public interface TituloRepository extends JpaRepository<Titulo, Long> {

}

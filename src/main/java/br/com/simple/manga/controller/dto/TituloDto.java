package br.com.simple.manga.controller.dto;

import java.util.List;
import java.util.stream.Collectors;

import br.com.simple.manga.model.Titulo;

public class TituloDto {

    private Long id;
    private String nome;
    private String artista;
    private String editora;
    private String genero;
    private Integer volume;

    public TituloDto(Titulo titulo) {

        this.id = titulo.getId();
        this.nome = titulo.getNome();
        this.artista = titulo.getArtista();
        this.editora = titulo.getEditora();
        this.genero = titulo.getGenero();

    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getArtista() {
        return artista;
    }

    public String getEditora() {
        return editora;
    }

    public String getGenero() {
        return genero;
    }

    public Integer getVolume() {
        return volume;
    }

    public static List<TituloDto> converter(List<Titulo> titulos) {
        return titulos.stream().map(TituloDto::new).collect(Collectors.toList());
    }

}

package br.com.simple.manga.model;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Volume {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer numeroVolume;
    // private Integer quantidadeDeVolumes;
    private BigDecimal preco;
    private Integer censusa;
    private String isbn;
    // private Integer quantidadeDePaginas;
    @ManyToOne
    private Titulo titulo;

    public Titulo getTitulo() {
        return titulo;
    }

    public void setTitulo(Titulo titulo) {
        this.titulo = titulo;
    }

    public Volume() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

    public Integer getCensusa() {
        return censusa;
    }

    public void setCensusa(Integer censusa) {
        this.censusa = censusa;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Integer getNumeroVolume() {
        return numeroVolume;
    }

    public void setNumeroVolume(Integer numeroVolume) {
        this.numeroVolume = numeroVolume;
    }

}

package br.com.simple.manga.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.simple.manga.controller.dto.TituloDto;
import br.com.simple.manga.model.Titulo;
import br.com.simple.manga.repository.TituloRepository;

@RestController
@RequestMapping("/titulos")
public class TitulosController {

    @Autowired
    private TituloRepository tituloRepository;

    @GetMapping
    public List<TituloDto> lista() {
        List<Titulo> titulos = tituloRepository.findAll();
        return TituloDto.converter(titulos);
    }
}

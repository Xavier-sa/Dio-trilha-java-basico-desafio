package com.exemplo.doceria.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exemplo.doceria.model.Doce;
import com.exemplo.doceria.repository.DoceRepository;

@RestController
@RequestMapping("/doces")
public class DoceController {
    private final DoceRepository doceRepository;

    public DoceController(DoceRepository doceRepository) {
        this.doceRepository = doceRepository;
    }

    @GetMapping
    public List<Doce> listar() {
        return doceRepository.findAll();
    }

    @PostMapping
    public Doce adicionar(@RequestBody Doce doce) {
        return doceRepository.save(doce);
    }
}

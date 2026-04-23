package com.github.baia.MyFinances.controller;

import com.github.baia.MyFinances.model.ResumoMensal;
import com.github.baia.MyFinances.repository.ResumoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/resumo")
public class ResumoController {

    @Autowired // Liga automaticamente ao Repository
    private ResumoRepository repository;

    @GetMapping
    public List<ResumoMensal> listar() {
        return repository.findAll(); // Busca todos os resumos no banco
    }

    @PostMapping
    public ResumoMensal salvar(@RequestBody ResumoMensal resumo) {
        return repository.save(resumo); // Salva o novo salário/gastos fixos
    }
}
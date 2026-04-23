package com.github.baia.MyFinances.controller;

import com.github.baia.MyFinances.model.Transacao;
import com.github.baia.MyFinances.repository.TransacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/transacoes")
public class TransacaoController {

    @Autowired
    private TransacaoRepository repository;

    @GetMapping
    public List<Transacao> listar() {
        return repository.findAll();
    }

    // METODO PARA SALVAR (Quando cliar no botão do Dashboard)
    @PostMapping
    public Transacao salvar(@RequestBody Transacao transacao) {
        return repository.save(transacao); // Salva no MySQL e retorna o que foi salvo
    }
}
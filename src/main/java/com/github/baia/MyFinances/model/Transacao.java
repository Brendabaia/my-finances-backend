package com.github.baia.MyFinances.model;

import jakarta.persistence.*; // Importa as anotações para o banco de dados

@Entity
public class Transacao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String descricao;
    private Double valor;
    private String cartaoOrigem;


    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getDescricao() { return descricao; }
    public void setDescricao(String descricao) { this.descricao = descricao; }
    public Double getValor() { return valor; }
    public void setValor(Double valor) { this.valor = valor; }
    public String getCartaoOrigem() { return cartaoOrigem; }
    public void setCartaoOrigem(String cartaoOrigem) { this.cartaoOrigem = cartaoOrigem; }
}
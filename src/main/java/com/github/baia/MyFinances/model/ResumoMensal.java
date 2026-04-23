package com.github.baia.MyFinances.model;

import jakarta.persistence.*;

@Entity
@Table(name = "resumo_mensal")
public class ResumoMensal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String mesReferencia;
    private Double salario;
    private Double aluguel;
    private Double cartaoNu;
    private Double cartaoItau;
    private Double dentista;
    private Double caixinha;


    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getMesReferencia() { return mesReferencia; }
    public void setMesReferencia(String mesReferencia) { this.mesReferencia = mesReferencia; }

    public Double getSalario() { return salario; }
    public void setSalario(Double salario) { this.salario = salario; }

    public Double getAluguel() { return aluguel; }
    public void setAluguel(Double aluguel) { this.aluguel = aluguel; }

    public Double getCartaoNu() { return cartaoNu; }
    public void setCartaoNu(Double cartaoNu) { this.cartaoNu = cartaoNu; }

    public Double getCartaoItau() { return cartaoItau; }
    public void setCartaoItau(Double cartaoItau) { this.cartaoItau = cartaoItau; }

    public Double getDentista() { return dentista; }
    public void setDentista(Double dentista) { this.dentista = dentista; }

    public Double getCaixinha() { return caixinha; }
    public void setCaixinha(Double caixinha) { this.caixinha = caixinha; }
}
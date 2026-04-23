package com.github.baia.MyFinances.repository;

import com.github.baia.MyFinances.model.ResumoMensal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ResumoRepository extends JpaRepository<ResumoMensal, Long> {
}
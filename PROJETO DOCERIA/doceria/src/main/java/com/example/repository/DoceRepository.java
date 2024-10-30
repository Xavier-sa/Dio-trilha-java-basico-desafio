package com.exemplo.doceria.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exemplo.doceria.model.Doce;

public interface DoceRepository extends JpaRepository<Doce, Long> {
}
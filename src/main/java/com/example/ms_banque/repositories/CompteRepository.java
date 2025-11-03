package com.example.ms_banque.repositories;

import com.example.ms_banque.entities.Compte;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface CompteRepository extends JpaRepository<Compte, Long> {
}

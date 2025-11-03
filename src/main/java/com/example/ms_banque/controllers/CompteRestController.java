package com.example.ms_banque.controllers;

import com.example.ms_banque.entities.Compte;
import com.example.ms_banque.repositories.CompteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/banque")
public class CompteRestController {

    @Autowired
    private CompteRepository compteRepository;

    // GET tous les comptes
    @GetMapping("/comptes")
    public List<Compte> getComptes() {
        return compteRepository.findAll();
    }

    // GET un compte par ID
    @GetMapping("/comptes/{id}")
    public Compte getCompte(@PathVariable Long id) {
        return compteRepository.findById(id).orElse(null);
    }

    // POST pour ajouter un compte
    @PostMapping("/comptes")
    public Compte addCompte(@RequestBody Compte compte) {
        return compteRepository.save(compte);
    }

    // PUT pour mettre à jour un compte
    @PutMapping("/comptes/{id}")
    public Compte updateCompte(@PathVariable Long id, @RequestBody Compte compte) {
        Compte existing = compteRepository.findById(id).orElse(null);
        if (existing != null) {
            existing.setSolde(compte.getSolde());
            existing.setDateCreation(compte.getDateCreation());
            existing.setType(compte.getType());
            return compteRepository.save(existing);
        }
        return null;
    }

    // DELETE pour supprimer un compte
    @DeleteMapping("/comptes/{id}")
    public void deleteCompte(@PathVariable Long id) {
        compteRepository.deleteById(id);
    }
}

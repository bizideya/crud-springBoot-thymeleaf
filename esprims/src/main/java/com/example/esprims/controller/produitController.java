package com.example.esprims.controller;

import com.example.esprims.domaine.Produit;
import com.example.esprims.service.ProduitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/produit")
public class produitController {
    @Autowired
    private ProduitService produitService;

    @GetMapping("/getAll")
    public List<Produit> getAll() {
        return produitService.getAll();
    }

    @GetMapping("/{id}")
    public Optional<Produit> findById( @PathVariable("id") long Id){
        return produitService.findById(Id);
    }

    @PostMapping("/create")
    public Produit create(@RequestBody Produit p){
        return produitService.create(p);
    }

    @DeleteMapping("/delete/{id}")
    public void delete( @PathVariable("id") long Id){
        produitService.delete(Id);
    }
    @PutMapping("/update")
    public Produit update(@RequestBody Produit p){
        return produitService.update(p);
    }







}

package com.example.esprims.service;

import com.example.esprims.domaine.Produit;

import java.util.List;
import java.util.Optional;

public interface ProductService {
    public List<Produit> getAll();

    public Optional<Produit> findById(long Id);

    public void delete(long Id);

    public Produit create(Produit p);


    public Produit update(Produit p);


    public Produit save(Produit p);
}

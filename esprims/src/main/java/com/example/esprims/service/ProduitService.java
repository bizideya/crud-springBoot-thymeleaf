package com.example.esprims.service;

import com.example.esprims.domaine.Produit;
import com.example.esprims.repository.ProduitRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class ProduitService implements ProductService{
    @Autowired
    private ProduitRepo productRepository;

    public List<Produit> getAll(){
        return productRepository.findAll();
    }

    public Optional<Produit> findById(long Id){
        return productRepository.findById(Id);
    }

    public void delete( long Id){

        productRepository.deleteById(Id);
    }

    public Produit create( Produit p)
    {
        return productRepository.save(p);
    }


    public Produit update( Produit p){
       Optional<Produit> utOptional= productRepository.findById(p.getId());
                if (utOptional.isEmpty()){
                 return null;
                 }
                else {
                    return productRepository.save(p);
                }
    }


    public Produit save(Produit p){
        return productRepository.save(p);
    }
}

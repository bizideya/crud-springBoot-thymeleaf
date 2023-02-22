package com.example.esprims.service;
import com.example.esprims.domaine.Category;
import com.example.esprims.repository.CategoryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class CategoryService implements CategService {
    @Autowired
    private CategoryRepo categoryRepository;

    public List<Category> getAll(){
        return categoryRepository.findAll();
    }

    public Optional<Category> findById(long Id){
        return categoryRepository.findById(Id);
    }

    public void delete( long Id){

        categoryRepository.deleteById(Id);
    }

    public Category create( Category c)
    {
        return categoryRepository.save(c);
    }



    public Category update( Category c){
        Optional<Category> utOptional= categoryRepository.findById(c.getId());
        if (utOptional.isEmpty()){
            return null;
        }
        else {
            return categoryRepository.save(c);
        }
    }


    public Category save(Category c){
        return categoryRepository.save(c);
    }
}





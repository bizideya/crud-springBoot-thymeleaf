package com.example.esprims.controller;

import com.example.esprims.domaine.Category;
import com.example.esprims.domaine.Produit;
import com.example.esprims.service.CategService;
import com.example.esprims.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categorie")
public class categoryController {
    @Autowired
    private CategService categoryService;

    @GetMapping("/getAll")
    public List<Category> getAll() {
        return categoryService.getAll();

    }
    @PostMapping("/save")
        public Category create(@RequestBody Category c) {
      return categoryService.create(c);
    }
    @PutMapping("/modif/{id}")
        public Category update(@RequestBody Category c){
                return categoryService.update(c);
            }

    @DeleteMapping("/delete/{id}")
    public void delete( @PathVariable("id") long Id){
        categoryService.delete(Id);
    }

    }
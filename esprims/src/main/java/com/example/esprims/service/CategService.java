package com.example.esprims.service;

import com.example.esprims.domaine.Category;

import java.util.List;
import java.util.Optional;

public interface CategService {
    public List<Category> getAll();
    public Optional<Category> findById(long Id);
    public void delete( long Id);
    public Category create( Category c);
    public Category update( Category c);
}

package com.educandoweb.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.educandoweb.course.entities.Category;
import com.educandoweb.course.repositories.CategoryRepositoy;
import com.educandoweb.course.services.exceptions.ResourceNotFoundException;

@Service
public class CategoryService {
    
    @Autowired
    private CategoryRepositoy repository;

    @Transactional(readOnly = true)
    public List<Category> findAll(){
        return repository.findAll();
    }
    
    @Transactional(readOnly = true)
    public Category findById (Long id){
        Optional<Category> obj = repository.findById(id);
        return obj.orElseThrow(() -> new ResourceNotFoundException(id));
    }
}

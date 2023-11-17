package com.educandoweb.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.educandoweb.course.entities.Product;
import com.educandoweb.course.repositories.ProductRepository;
import com.educandoweb.course.services.exceptions.ResourceNotFoundException;


@Service
public class ProductService {
    
    @Autowired
    private ProductRepository repository;

    @Transactional(readOnly = true)
    public List<Product> findAll(){
        return repository.findAll();
    }

    @Transactional(readOnly = true)
    public Product findById (Long id){
        Optional<Product> obj = repository.findById(id);
        return obj.orElseThrow(() -> new ResourceNotFoundException(id));
    }
}

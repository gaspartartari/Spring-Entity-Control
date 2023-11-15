package com.educandoweb.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.educandoweb.course.entities.Order;
import com.educandoweb.course.repositories.OrderRepositoy;

@Service
public class OrderService {
    
    @Autowired
    private OrderRepositoy repository;

    @Transactional(readOnly = true)
    public List<Order> findAll(){
        return repository.findAll();
    }

    @Transactional(readOnly = true)
    public Order findById (Long id){
        Optional<Order> obj = repository.findById(id);
        return obj.get();
    }
}

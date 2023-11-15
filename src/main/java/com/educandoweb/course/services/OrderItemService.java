package com.educandoweb.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.educandoweb.course.entities.OrderItem;
import com.educandoweb.course.repositories.OrderItemRepository;

@Service
public class OrderItemService {
    
    @Autowired
    private OrderItemRepository repository;

    @Transactional(readOnly = true)
    public List<OrderItem> findAll(){
        return repository.findAll();
    }

    @Transactional(readOnly = true)
    public OrderItem findById (Long id){
        Optional<OrderItem> obj = repository.findById(id);
        return obj.get();
    }
}

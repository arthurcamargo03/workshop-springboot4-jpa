package com.educandoweb.webservices.services;

import com.educandoweb.webservices.entities.Order;
import com.educandoweb.webservices.entities.User;
import com.educandoweb.webservices.repositories.OrderRepository;
import com.educandoweb.webservices.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {


    @Autowired
    private OrderRepository repository;

    @GetMapping
    public List<Order> findAll()  {
        return repository.findAll();
    }

    public Order findById(Long id){
        Optional<Order> obj = repository.findById(id);
        return obj.get();
    }
}

package com.educandoweb.webservices.services;

import com.educandoweb.webservices.entities.Category;
import com.educandoweb.webservices.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {


    @Autowired
    private CategoryRepository repository;

    @GetMapping
    public List<Category> findAll()  {
        return repository.findAll();
    }

    public Category findById(Long id){
        Optional<Category> obj = repository.findById(id);
        return obj.get();
    }
}

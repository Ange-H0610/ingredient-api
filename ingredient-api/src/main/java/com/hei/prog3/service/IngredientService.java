package com.hei.prog3.service;

import com.hei.prog3.entity.Ingredient;
import com.hei.prog3.repository.IngredientRepository;
import org.springframework.stereotype.Service;

@Service
public class IngredientService {

    private final IngredientRepository repository;

    public IngredientService(IngredientRepository repository) {
        this.repository = repository;
    }

    public Ingredient getIngredientById(Integer id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Ingredient.id=" + id + " is not found"));
    }
}
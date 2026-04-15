package com.hei.prog3.controller;

import com.hei.prog3.service.IngredientService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ingredients")
public class IngredientController {

    private final IngredientService service;

    public IngredientController(IngredientService service) {
        this.service = service;
    }

    // ✅ Endpoint b)
    @GetMapping("/{id}")
    public ResponseEntity<?> getIngredient(@PathVariable Integer id) {
        try {
            return ResponseEntity.ok(service.getIngredientById(id));
        } catch (RuntimeException e) {
            return ResponseEntity.status(404).body(e.getMessage());
        }
    }
}
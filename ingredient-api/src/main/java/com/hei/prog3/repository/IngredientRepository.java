package com.hei.prog3.repository;

import com.hei.prog3.entity.Ingredient;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class IngredientRepository {

    private final JdbcTemplate jdbcTemplate;

    public IngredientRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public Optional<Ingredient> findById(Integer id) {
        String sql = "SELECT * FROM ingredient WHERE id = ?";

        List<Ingredient> result = jdbcTemplate.query(sql, (rs, rowNum) -> {
            Ingredient i = new Ingredient();
            i.setId(rs.getInt("id"));
            i.setNom(rs.getString("nom"));
            i.setCategorie(rs.getString("categorie"));
            i.setPrix(rs.getDouble("prix"));
            return i;
        }, id);

        return result.stream().findFirst();
    }
}
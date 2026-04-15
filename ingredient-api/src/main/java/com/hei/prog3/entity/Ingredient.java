package com.hei.prog3.entity;

public class Ingredient {
    private Integer id;
    private String nom;
    private String categorie;
    private Double prix;

    public Ingredient() {
    }

    public Ingredient(Integer id, String nom, String categorie, Double prix) {
        this.id = id;
        this.nom = nom;
        this.categorie = categorie;
        this.prix = prix;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    public Double getPrix() {
        return prix;
    }

    public void setPrix(Double prix) {
        this.prix = prix;
    }
}
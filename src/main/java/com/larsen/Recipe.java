package com.larsen;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Recipe {
    private String name;
    private Map<Ingredient, Double> ingredients;

    public Recipe(String name) {
        this.name = name;
        this.ingredients = new HashMap<>();
    }

    public String getName() { return name; }

    public void addIngredient(Ingredient ingredient, double quantity) {
        ingredients.put(ingredient, quantity);
    }

    public double getRecipePrice() {
        double price = 0;

        for (Map.Entry<Ingredient, Double> entry : ingredients.entrySet()) {
            Ingredient ingredient = entry.getKey();
            double quantity = entry.getValue();
            price += ingredient.getValue() * quantity;
        }

        return price;
    }
}

package com.larsen;

public class MenuItem {
    private Recipe recipe;
    private double price;
    private String name;

    public MenuItem(Recipe recipe, double price, String name) {
        this.recipe = recipe;
        this.price = price;
        this.name = name;
    }
}

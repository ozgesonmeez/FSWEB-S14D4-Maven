package org.example.model;

public class Store {

    public static void listProducts(ProductForSale[] products) {
        for (ProductForSale product : products) {
            product.showDetails();
            System.out.println();
        }
    }

    public static void main(String[] args) {

        ProductForSale[] products = new ProductForSale[3];

        products[0] = new Chocolate("Milk Chocolate", 2.5, "Sweet milk chocolate");
        products[1] = new Coke("Coca Cola", 1.5, "Cold drink");
        products[2] = new Bread("Sourdough Bread", 3.0, "Fresh baked bread");

        listProducts(products);
    }
}
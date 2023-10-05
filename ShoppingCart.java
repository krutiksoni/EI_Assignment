package com.EI_Assignment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class ShoppingCart {
    private Map<Product, Integer> cartItems = new HashMap<>();
    private DiscountStrategy discountStrategy;

    public ShoppingCart(DiscountStrategy discountStrategy) {
        this.discountStrategy = discountStrategy;
    }

    public void addToCart(Product product, int quantity) {
        if (cartItems.containsKey(product)) {
            cartItems.put(product, cartItems.get(product) + quantity);
        } else {
            cartItems.put(product, quantity);
        }
    }

    public void updateQuantity(Product product, int quantity) {
        if (cartItems.containsKey(product)) {
            cartItems.put(product, quantity);
        }
    }

    public void removeFromCart(Product product) {
        cartItems.remove(product);
    }

    public double calculateTotalBill() {
        double totalBill = 0;
        for (Map.Entry<Product, Integer> entry : cartItems.entrySet()) {
            Product product = entry.getKey();
            int quantity = entry.getValue();
            totalBill += discountStrategy.applyDiscount(product.getPrice(), quantity);
        }
        return totalBill;
    }

    public void displayCart() {
        System.out.println("Cart Items:");
        List<String> cartItemDescriptions = new ArrayList<>();
        for (Map.Entry<Product, Integer> entry : cartItems.entrySet()) {
            Product product = entry.getKey();
            int quantity = entry.getValue();
            cartItemDescriptions.add(quantity + " " + product.getName());
        }
        System.out.println("You have " + String.join(" and ", cartItemDescriptions) + " in your cart.");
        System.out.println("Total Bill: Your total bill is $" + calculateTotalBill());
    }
}

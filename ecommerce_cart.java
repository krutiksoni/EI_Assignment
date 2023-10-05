package com.EI_Assignment;

public class ecommerce_cart {
    public static void main(String[] args) {
        ElectronicsProduct laptop = new ElectronicsProduct("Laptop", 1000, true);
        ApparelProduct headphones = new ApparelProduct("Headphones", 50, true);

        DiscountStrategy discountStrategy = new PercentageDiscountStrategy(10);
        ShoppingCart cart = new ShoppingCart(discountStrategy);

        cart.addToCart(laptop, 2);
        cart.addToCart(headphones, 1);

        cart.displayCart();

        // Update quantity and remove items
        cart.updateQuantity(laptop, 1);
        cart.removeFromCart(headphones);

        cart.displayCart();
    }
}

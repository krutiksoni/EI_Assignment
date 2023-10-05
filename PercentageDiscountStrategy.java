package com.EI_Assignment;

class PercentageDiscountStrategy implements DiscountStrategy {
    private double discountPercentage;

    public PercentageDiscountStrategy(double discountPercentage) {
        this.discountPercentage = discountPercentage;
    }

    @Override
    public double applyDiscount(double price, int quantity) {
        return price * (1 - discountPercentage / 100) * quantity;
    }
}

package org.example.shoppingcartapp;

import java.util.List;

public class CartService {

    public double calculateItemTotal(double price, int quantity) {
        return price * quantity;
    }

    public double calculateCartTotal(List<Double> totals) {
        return totals.stream().mapToDouble(Double::doubleValue).sum();
    }
}
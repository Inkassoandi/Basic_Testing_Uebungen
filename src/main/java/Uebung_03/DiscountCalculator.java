package Uebung_03;

public class DiscountCalculator {

    public double calculateDiscount(double price) {
        double discount = 0.0;

        if (price < 0) {
            throw new IllegalArgumentException("Price cannot be negative");
        } else if (price <= 50) {
            discount = 0.0;
        } else if (price >= 50 && price <= 99.99) {
            discount = price * 0.05;
        } else if (price >= 100 && price <= 499.99) {
            discount = price * 0.10;
        } else if (price >= 500) {
            discount = price * 0.2;
        }
        return discount;
    }
}

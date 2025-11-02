package Uebung03;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiscountCalculatorTest {

    @Test
    void calculateDiscount() {

        DiscountCalculator cals = new DiscountCalculator();

       // Preis < 50 → kein Rabatt
       assertEquals(0, cals.calculateDiscount(30));
       // Preis = 80 → 5 % Rabatt
       assertEquals(4, cals.calculateDiscount(80));
       // Preis = 250 → 10 % Rabatt
       assertEquals(25, cals.calculateDiscount(250));
       // Preis = 600 → 20 % Rabatt
       assertEquals(120, cals.calculateDiscount(600));
       // Negativer Preis → Exception
       assertThrows(IllegalArgumentException.class, () -> cals.calculateDiscount(-10));


    }
}
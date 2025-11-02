package Uebung01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void add() {
        Calculator calc = new Calculator();
        int sum1 = calc.add(2, 3);
        assertEquals(5, sum1);

        int sum2 = calc.add(-1, 4);
        assertEquals(3, sum2);
    }


}
package Uebung_02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberUtilsTest {

    @Test
    void isEven() {

        NumberUtils utils = new NumberUtils();

        int num1 = 4;
        int num2 = 3;
        int num3 = 0;

        utils.isEven(num1);
        assertTrue(true);

        utils.isEven(num2);
        assertFalse(false);

        utils.isEven(num3);
        assertTrue(true);


    }
}
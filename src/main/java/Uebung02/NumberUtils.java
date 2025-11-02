package Uebung02;

public class NumberUtils {

    public boolean isEven(int number) {
       boolean even;
        if (number % 2 == 0){
            even = true;
        } else {
            even = false;
        }
        return even;
    }

}

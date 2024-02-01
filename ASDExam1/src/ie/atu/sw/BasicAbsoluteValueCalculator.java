package ie.atu.sw;

import static java.lang.Math.*;


public class BasicAbsoluteValueCalculator implements AbsoluteValueCalculator {
    private final double threshold = 42.00d;

    @Override
    public double calculate(double number) {
    	//return number >= threshold ? abs(number) : number; This gave me NaN for Absolute and reversed values.
        return number >= threshold ? abs(number) : abs(number);
    }
}
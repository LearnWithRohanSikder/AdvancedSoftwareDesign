package ie.atu.sw;

/*
 * Switch from one log base to another using the formula:
 *    log_b(x) = log_d(x) / log_d(b)
 */


public class DefaultLogarithmBaseCalculator implements LogarithmBaseCalculator {
    private final double base;

    public DefaultLogarithmBaseCalculator(double base) {
        this.base = base;
    }

    @Override
    public double calculate(double number) {
        return Math.log10(number) / Math.log10(base);
    }
}

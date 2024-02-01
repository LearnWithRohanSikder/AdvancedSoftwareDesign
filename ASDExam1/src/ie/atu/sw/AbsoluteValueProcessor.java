package ie.atu.sw;

public class AbsoluteValueProcessor {
    private final AbsoluteValueCalculator absoluteValueCalculator;
    private final LogarithmBaseCalculator logarithmBaseCalculator;

    public AbsoluteValueProcessor(AbsoluteValueCalculator absoluteValueCalculator, LogarithmBaseCalculator logarithmBaseCalculator) {
        this.absoluteValueCalculator = absoluteValueCalculator;
        this.logarithmBaseCalculator = logarithmBaseCalculator;
    }

    
    // Calculate the logarithm of the absolute value using the injected logarithm base calculator
    public double process(double number) {
        double absoluteValue = absoluteValueCalculator.calculate(number);
        return logarithmBaseCalculator.calculate(absoluteValue);
    }
}


package ie.atu.sw;

public class Main {
    public static void main(String[] args) {
        // Create instances of AbsoluteValueCalculator and LogarithmBaseCalculator
        AbsoluteValueCalculator absoluteValueCalculator = new BasicAbsoluteValueCalculator();
        LogarithmBaseCalculator logarithmBaseCalculator = new DefaultLogarithmBaseCalculator(10); // Base 10 logarithm

        // Create AbsoluteValueProcessor with injected calculators
        AbsoluteValueProcessor processor = new AbsoluteValueProcessor(absoluteValueCalculator, logarithmBaseCalculator);

        // Sample input number
        double inputNumber = -50.0;

        // Get absolute value
        double absoluteValue = processor.process(inputNumber);
        System.out.println("Absolute Value: " + absoluteValue);

        // Flip bits
        BitFlipper bitFlipper = new BitFlipper();
        double flippedValue = bitFlipper.flipBits(absoluteValue);
        System.out.println("Flipped Value: " + flippedValue);

        // Reverse bits
        Reverser reverser = new Reverser();
        double reversedValue = reverser.reverseBits(flippedValue);
        System.out.println("Reversed Value: " + reversedValue);
        
        
        //Module Example 
        /*
        AbsoluteValueCalculator absoluteValueCalculator = new BasicAbsoluteValueCalculator();
        double absoluteValue = absoluteValueCalculator.calculate(-50.0);
        System.out.println(absoluteValue);
        */
    }
  }

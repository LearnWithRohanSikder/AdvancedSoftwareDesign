package ie.atu.sw;

public class Reverser {
    public double reverseBits(double value) {
        long bits = Double.doubleToLongBits(value);
        return Double.longBitsToDouble(Long.reverse(bits));
    }
}

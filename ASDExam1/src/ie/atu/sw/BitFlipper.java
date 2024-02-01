package ie.atu.sw;

public class BitFlipper {
    public double flipBits(double value) {
        long bits = Double.doubleToLongBits(value);
        return Double.longBitsToDouble(~bits);
    }
}

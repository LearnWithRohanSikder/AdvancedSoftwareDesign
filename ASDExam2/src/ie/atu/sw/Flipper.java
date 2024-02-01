package ie.atu.sw;

public class Flipper implements Operation {
	
	// Reverses String
    @Override
    public String execute(Object params) {
        String s = (String) params;
        return new StringBuilder(s).reverse().toString();
    }
}

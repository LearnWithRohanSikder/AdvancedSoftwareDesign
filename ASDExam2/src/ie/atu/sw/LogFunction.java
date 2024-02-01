package ie.atu.sw;

import java.util.Arrays;

public class LogFunction implements Operation {

	// Gets Log
	@Override
	public Double execute(Object params) {
		Double[] numbers = (Double[]) params;
		return Arrays.stream(numbers).mapToDouble(Math::log).sum();
	}
}

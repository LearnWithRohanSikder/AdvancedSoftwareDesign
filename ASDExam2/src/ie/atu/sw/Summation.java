package ie.atu.sw;

import java.util.Arrays;

public class Summation implements Operation {
	@Override
	public Integer execute(Object params) {
		Integer[] numbers = (Integer[]) params;
		return Arrays.stream(numbers).reduce(0, Integer::sum);
	}
}

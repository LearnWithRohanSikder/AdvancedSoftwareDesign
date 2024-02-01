package ie.atu.sw;

public class OperationFactory {

	public static Operation createOperation(String operationType) {
		switch (operationType) {
		case "summation":
			return new Summation();
		case "flipper":
			return new Flipper();
		case "logFunction":
			return new LogFunction();
		default:
			throw new IllegalArgumentException("Unknown operation type: " + operationType);
		}
	}
}

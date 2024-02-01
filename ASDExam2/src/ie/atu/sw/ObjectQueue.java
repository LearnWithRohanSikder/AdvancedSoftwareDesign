package ie.atu.sw;

import java.util.HashMap;
import java.util.Map;

public class ObjectQueue {

	// Manages Operations which is manages by priority level
	private Priority level = Priority.NORMAL_PRIORITY;
	private Map<String, Operation> operations = new HashMap<>();

	public void add(String operationName, Operation operation) {
		operations.put(operationName, operation);
	}

	public Object execute(String request, Object params) {
		Operation operation = operations.get(request);
		if (operation != null) {
			return operation.execute(params);
		}
		return null;
	}
}

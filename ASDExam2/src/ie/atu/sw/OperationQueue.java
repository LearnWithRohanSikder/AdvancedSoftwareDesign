package ie.atu.sw;

import java.util.ArrayDeque;
import java.util.Deque;

public class OperationQueue implements QueueService {

	// QueueService that uses a deque to store and execute operations.
	private Deque<Operation> operations = new ArrayDeque<>();

	@Override
	public void enqueue(Operation operation) {
		operations.addLast(operation);
	}

	@Override
	public Object execute(Object params) {
		if (!operations.isEmpty()) {
			Operation operation = operations.pop();
			return operation.execute(params);
		}
		return null;
	}
}

package ie.atu.sw;

// Queue service that can enqueue and execute operations.
public interface QueueService {
	void enqueue(Operation operation);

	Object execute(Object params);
}

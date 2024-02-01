package ie.atu.sw;

public class OperationQueueProxy implements QueueService {
	private QueueService queueService;

	public OperationQueueProxy(QueueService queueService) {
		this.queueService = queueService;
	}

	@Override
	public void enqueue(Operation operation) {
		// Access control implementation
		queueService.enqueue(operation);
	}

	@Override
	public Object execute(Object params) {
		// Caching implementation
		return queueService.execute(params);
	}
}

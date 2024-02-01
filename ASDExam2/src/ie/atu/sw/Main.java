package ie.atu.sw;

public class Main {
    public static void main(String[] args) {
        // Queue
        ObjectQueue queue = new ObjectQueue();
        
        // Create and add operations to the queue
        queue.add("summation", new Summation());
        queue.add("flipper", new Flipper());
        queue.add("product", new LogFunction());
        
        //queue.add("summation", OperationFactory.createOperation("summation"));
        //queue.add("flipper", OperationFactory.createOperation("flipper"));
        //queue.add("logFunction", OperationFactory.createOperation("logFunction"));


        Integer[] numbersForSummation = {1, 2, 3, 4, 5};
        String textForFlipping = "hello";
		Double[] numbersForProduct = { 1.0, 2.0, 3.0};

        // Summation operation
        Integer sumResult = (Integer) queue.execute("summation", numbersForSummation);
        System.out.println("The sum is: " + sumResult);

        // Flipper operation
        String flipResult = (String) queue.execute("flipper", textForFlipping);
        System.out.println("The flipped text is: " + flipResult);

        // Product operation
        Double productResult = (Double) queue.execute("product", numbersForProduct);
        System.out.println("The product of logs is: " + productResult);
    }
}

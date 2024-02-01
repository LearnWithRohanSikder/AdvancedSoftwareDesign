package ie.atu.sw;

public class Runner {
	public static void main(String[] args) throws Throwable{
		Cypherable cypher = new RSACypher();

		//Get byte and then encrypt
		byte[] s = new String("HAPPY DAYS").getBytes("UTF-8");
		byte[] t = cypher.encrypt(s);
		
		//Print encrypted stuff and then decrypt it
		System.out.println(new String(t));
		System.out.println(new String(cypher.decrypt(t)));
	}
}
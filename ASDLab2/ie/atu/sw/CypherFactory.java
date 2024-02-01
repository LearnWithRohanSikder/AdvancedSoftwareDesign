package ie.atu.sw;

public class CypherFactory {
	private static CypherFactory cf =  new CypherFactory();
	
	private CypherFactory() {
		
	}
	
	public static CypherFactory getInstance() {
		return cf;
	}
	
	public Cypherable getCypher(CypherAlgo algo) throws Throwable{
		return switch (algo) {
		case AES -> new AESCipher(algo.algorithm(), algo.padding());
		case DES -> null;
		case RSA -> null;
		};
		
	}
	

}

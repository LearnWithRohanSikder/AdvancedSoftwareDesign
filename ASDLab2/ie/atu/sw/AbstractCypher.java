package ie.atu.sw;

import java.security.Key;

import javax.crypto.Cipher;

public abstract class AbstractCypher implements Cypherable {
	
	private Cipher cypher;
	
	
	public AbstractCypher(String algorithm) throws Throwable {
		super();
		this.cypher = Cipher.getInstance(algorithm);
	}

	 byte[] encrypt(byte[] plainText,Key key) throws Throwable {
		//Getting public key and encrypting
		cypher.init(Cipher.ENCRYPT_MODE, key);
		return cypher.doFinal(plainText);
	}

	 byte[] decrypt(byte[] cypherText,Key key) throws Throwable {
		// Do opposite to decrypt
		cypher.init(Cipher.DECRYPT_MODE, key);
		return cypher.doFinal(cypherText);
	}
	
	 @Override
	public abstract byte[] encrypt(byte[] plainText) throws Throwable;
	 @Override
	public abstract byte[] decrypt(byte[] cypherText) throws Throwable;
	
}
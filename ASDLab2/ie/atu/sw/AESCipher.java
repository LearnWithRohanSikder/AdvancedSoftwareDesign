package ie.atu.sw;

import java.security.Key;

import javax.crypto.KeyGenerator;

public class AESCipher extends AbstractCypher{
	private Key key;

	public AESCipher(String algorithm, String padding) throws Throwable {
		super(padding);
		
		KeyGenerator keyGen = KeyGenerator.getInstance(algorithm);
		keyGen.init(128);
		key = keyGen.generateKey();
		// TODO Auto-generated constructor stub
	}

	@Override
	public byte[] encrypt(byte[] plainText) throws Throwable {
		// TODO Auto-generated method stub
		return super.encrypt(plainText, key);
	}

	@Override
	public byte[] decrypt(byte[] cypherText) throws Throwable {
		// TODO Auto-generated method stub
		return super.decrypt(cypherText, key);
	}
	
	
	
	
}

package ie.atu.sw;

import java.security.*;
import javax.crypto.*;

public class RSACypher extends AbstractCypher{
	private KeyPair keyRing;//Key Pair public and private keys
	
	
	
	public RSACypher(String algorithm) throws Throwable{
		super(algorithm);
		//Singleton
		//Get Handle on RSA
		KeyPairGenerator keyGen = KeyPairGenerator.getInstance("RSA"); 
		keyGen.initialize(2048);
		keyRing = keyGen.generateKeyPair();//Generate key pair
	}


	@Override
	public byte[] encrypt(byte[] plainText) throws Throwable {
		// TODO Auto-generated method stub
		return super.encrypt(plainText, keyRing.getPublic());
	}


	@Override
	public byte[] decrypt(byte[] cypherText) throws Throwable {
		// TODO Auto-generated method stub
		return super.decrypt(cypherText, keyRing.getPrivate());
	}
}
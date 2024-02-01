package ie.atu.sw;

public enum CypherAlgo {
	AES("AES", "AES/ECB/PKCS5Padding"),
	DES("DES", "DES/ECB/PKCS5Padding"),
	RSA("RSA", "RSA/ECB/PKCS1Padding");
	
	private String algorithm;
	private String padding;

	CypherAlgo(String algo, String padding) {
		this.algorithm = algo;
		this.padding = padding;
	}

	public String algorithm() {
		return algorithm;
	}

	public String padding() {
		return padding;
	}
}

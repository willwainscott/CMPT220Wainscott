import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;

public class GenerateKeys {
	
	private KeyPairGenerator pairGen;
	private KeyPair pair;
	private PublicKey publicKey;
	private PrivateKey privateKey;
	
	//constructor that initializes a specific Key generator
	public GenerateKeys() throws NoSuchAlgorithmException { 
		pairGen = KeyPairGenerator.getInstance("RSA");
		pairGen.initialize(2048);	
	}
	
	// creates the Key objects using the generator
	public void createKeys() {
		pair = pairGen.generateKeyPair();
		publicKey = pair.getPublic();
		privateKey = pair.getPrivate();
	}
	
	public PublicKey getPublicKey() {
		return publicKey;
	}
	
	public PrivateKey getPrivateKey() {
		return privateKey;
	}
	
	//creates the file to write the key into
	public void createTextFile(byte[] key, String name) throws IOException {
		File f1 = new File(name);
		f1.getParentFile().mkdirs();
		
		FileOutputStream output = new FileOutputStream(f1);
		output.write(key);
		output.close();
	}
	
	public static void main(String[] args) throws NoSuchAlgorithmException, IOException {
		
		GenerateKeys keyGen = new GenerateKeys();
		keyGen.createKeys();
		keyGen.createTextFile(keyGen.getPublicKey().getEncoded(), "Encryption/publicKey");
		keyGen.createTextFile(keyGen.getPrivateKey().getEncoded(), "Encryption/privateKey");
		
		//this the files with the keys written in them and adds them to a folder
		
		System.out.print("Your keys have been created, add a .txt file to the Encryption "
				+ "folder to encrypt the message inside.");
	}
}

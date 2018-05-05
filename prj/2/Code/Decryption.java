import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;

public class Decryption {
	
	private Cipher cipher;
	
	// constructor that creates the cipher to interpret the keys
	public Decryption() throws NoSuchAlgorithmException, NoSuchPaddingException {
		this.cipher = Cipher.getInstance("RSA");
	}
	
	// converts the key file to a key object
	public PrivateKey getPrivateKey(String keyFileName) throws IOException,
	NoSuchAlgorithmException, InvalidKeySpecException {
		
		byte[] keyBytes = Files.readAllBytes(Paths.get(keyFileName));
		
		PKCS8EncodedKeySpec keySpec = new PKCS8EncodedKeySpec(keyBytes);
		KeyFactory keyFact = KeyFactory.getInstance("RSA");
		
		return keyFact.generatePrivate(keySpec);
	}
	
	// takes the encrypted file and converts it back to its original message
	public void decryptFile(File startingFile, String newFileName, PrivateKey key) throws
		IOException, InvalidKeyException, IllegalBlockSizeException, BadPaddingException {
		
		FileInputStream input = new FileInputStream(startingFile);
		byte[] fileBytes = new byte[(int) startingFile.length()];
		input.read(fileBytes);
		input.close();
		
		this.cipher.init(Cipher.DECRYPT_MODE, key);
		
		File f = new File(newFileName);
		
		FileOutputStream output = new FileOutputStream(f);
		output.write(this.cipher.doFinal(fileBytes));
		output.close();
		
	}
	
	public static void main(String[] args) throws Exception {
		Decryption dec = new Decryption();
		
		PrivateKey privateKey = dec.getPrivateKey("Encryption/privateKey");
		
		dec.decryptFile(new File("Encryption/EncryptedMessage"),"Encryption/DecryptedMessage", privateKey);
		
		System.out.print("Your message has been successfuly decrypted.");
	}
}

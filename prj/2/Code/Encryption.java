import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import java.util.Scanner;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;

public class Encryption {
	
	private Cipher cipher;
	
	// constructor that creates the cipher that will interpret the keys
	public Encryption() throws NoSuchAlgorithmException, NoSuchPaddingException {
		this.cipher = Cipher.getInstance("RSA");
	}
	
	// converts the key file back to a key object
	public PublicKey getPublicKey(String keyFileName) throws IOException, 
		NoSuchAlgorithmException, InvalidKeySpecException {
		
		byte[] keyBytes = Files.readAllBytes(Paths.get(keyFileName));
		
		X509EncodedKeySpec keySpec = new X509EncodedKeySpec(keyBytes);
		KeyFactory keyFact = KeyFactory.getInstance("RSA");
		
		return keyFact.generatePublic(keySpec);
	}
	
	// takes the entered text file and creates a new file with the encoded message
	public void encryptFile(File startingFile, String newFileName, PublicKey key) throws 
		IOException, InvalidKeyException, IllegalBlockSizeException, BadPaddingException {
		
		FileInputStream input = new FileInputStream(startingFile);
		byte[] fileBytes = new byte[(int) startingFile.length()];
		input.read(fileBytes);
		input.close();
		
		this.cipher.init(Cipher.ENCRYPT_MODE, key);
		
		File f = new File(newFileName);
		
		FileOutputStream output = new FileOutputStream(f);
		output.write(this.cipher.doFinal(fileBytes));
		output.close();
		
	}
	
	
	public static void main(String[] args) throws Exception {
		Scanner input = new Scanner(System.in);
		System.out.println("What is the name of your file? (not including the .txt) ");
		String fileName = input.next();
		input.close();
		
		Encryption enc = new Encryption();
		
		PublicKey publicKey = enc.getPublicKey("Encryption/publicKey");
		
		if ( new File("Encryption/" + fileName + ".txt").exists()) {
			enc.encryptFile(new File("Encryption/" + fileName + ".txt"), "Encryption/EncryptedMessage"
					, publicKey);
			System.out.println("Your message has successfuly been encrypted.");
		} else {
			System.out.println("Make sure your .txt file is in the Encryption folder, and "
					+ "it has the same name as you entered above.");
		}
		
	}
	
}

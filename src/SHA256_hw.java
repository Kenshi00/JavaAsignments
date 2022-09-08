import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
public class SHA256_hw {
	
	public static void main(String[] args) throws NoSuchAlgorithmException{
		System.out.println(sha256("homework"));
		
	
	}
	public static byte[] sha256(String msg) throws NoSuchAlgorithmException{
		MessageDigest md=MessageDigest.getInstance("SHA-256");
		md.update(msg.getBytes());
		
		return md.digest();
	}
}


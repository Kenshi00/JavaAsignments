import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
public class SHA256 {
	public static void main(String[] args) throws NoSuchAlgorithmException{
		
		SHA256 sha256=new SHA256();
		int bitsize=1;
		int nonce=1;
		int zeroCount=0;
		boolean goAhead=true;
//		while(goAhead) {
			// nonce x 
			
			String password = "homework"+nonce;
			// SHA256으로 암호화된 비밀번호
			String cryptogram= sha256.encrypt(password);
			System.out.println(cryptogram);
			//String[] arr=cryptogram.split(""); // split 함수로 String 배열에 한글자씩 나눠서 저장
			//System.out.println(arr.length);
			String str=cryptogram.substring(0,5);
		//	System.out.println(str);
			
		//	System.out.println(String.format("%4s",Integer.toBinaryString(i)).replace(" ", "0"));
			
//			String Binary_20bit=Integer.toBinaryString(intValue);
//			System.out.println(Binary_20bit);
//			for(int i=0;i<bitsize;i++) {
//				if(Binary_20bit.charAt(i)=='0') {
//					zeroCount++;
//				}
//				else {
//					break;
//				}
//			}
//			if(zeroCount==bitsize) {
//				goAhead=false;
//			}
//			else {
//				nonce++;
//			}
//		}
//		System.out.println("찾았습니다.");
	}
	public String encrypt(String text) throws NoSuchAlgorithmException{
		MessageDigest md=MessageDigest.getInstance("SHA-256");
		md.update(text.getBytes());
		return bytesToHex(md.digest());
	}
	
	private String bytesToHex(byte[] bytes) {
		StringBuilder builder=new StringBuilder();
		for(byte b:bytes) {
			builder.append(String.format("%02x",b));
			
		}
		System.out.println(bytes[0]);
		return builder.toString();
	}
}

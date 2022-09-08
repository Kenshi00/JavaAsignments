// 과제 1번 입니다.(homework SHA256으로 암호화하기)
import java.security.MessageDigest;
import java.util.Arrays;

public class JiyunLee1 {

	public static void main(String[] args) {
		
		
		System.out.println("[SHA256 사용해서 데이터 인코딩(암호화)실시]");
			/*[설 명]
			 * 1. SHA-256 - 단방향 암호화 기법으로 디코딩(복호화)를 할 수 없는 방법입니다
			 * 2. SHA-256은 SHA 시리즈 중에서 가장 보편적으로 사용되고 있습니다		 
			 */
			String data = "homework"; //초기 문자열 변수 선언 실시
			
			System.out.println("원본 : "+data);
			
			System.out.println("sha256 인코딩(문자열) : "+getSHA256(data));
			
			byte encode[] = getSHA256_ByteArray(data);
			
			System.out.println("sha256 인코딩(바이트) : "+Arrays.toString(encode));
			String temp="";
			for(int i=0;i<encode.length;i++) {
				String s1=String.format("%8s", Integer.toBinaryString(encode[i]&0xFF)).replace(' ', '0');
				temp+=s1;
			}
			System.out.println(temp);
			System.out.println();
			
		
		
	}//메인 종료
	
	// ==== [SHA256 인코딩 - 문자열] ====
	public static String getSHA256(String data) {
		String SHA = "";
		try {
			MessageDigest sh = MessageDigest.getInstance("SHA-256");
			sh.update(data.getBytes());
			byte byteData[] = sh.digest();
			StringBuffer sb = new StringBuffer();
			for (int i = 0; i < byteData.length; i++) {
				sb.append(Integer.toString((byteData[i] & 0xff) + 0x100, 16).substring(1));
			}
			SHA = sb.toString();

		} catch (Exception e) {
			e.printStackTrace();
			SHA = null;
		}
		return SHA;
	}
	
	// ==== [SHA256 인코딩 - 바이트] ====
	public static byte[] getSHA256_ByteArray (String data) {
		byte byteData[] = null;
		try {
			MessageDigest sh = MessageDigest.getInstance("SHA-256");
			sh.update(data.getBytes());
			byteData = sh.digest();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return byteData;
	}
	
}//클래스 종료


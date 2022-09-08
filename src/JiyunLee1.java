// ���� 1�� �Դϴ�.(homework SHA256���� ��ȣȭ�ϱ�)
import java.security.MessageDigest;
import java.util.Arrays;

public class JiyunLee1 {

	public static void main(String[] args) {
		
		
		System.out.println("[SHA256 ����ؼ� ������ ���ڵ�(��ȣȭ)�ǽ�]");
			/*[�� ��]
			 * 1. SHA-256 - �ܹ��� ��ȣȭ ������� ���ڵ�(��ȣȭ)�� �� �� ���� ����Դϴ�
			 * 2. SHA-256�� SHA �ø��� �߿��� ���� ���������� ���ǰ� �ֽ��ϴ�		 
			 */
			String data = "homework"; //�ʱ� ���ڿ� ���� ���� �ǽ�
			
			System.out.println("���� : "+data);
			
			System.out.println("sha256 ���ڵ�(���ڿ�) : "+getSHA256(data));
			
			byte encode[] = getSHA256_ByteArray(data);
			
			System.out.println("sha256 ���ڵ�(����Ʈ) : "+Arrays.toString(encode));
			String temp="";
			for(int i=0;i<encode.length;i++) {
				String s1=String.format("%8s", Integer.toBinaryString(encode[i]&0xFF)).replace(' ', '0');
				temp+=s1;
			}
			System.out.println(temp);
			System.out.println();
			
		
		
	}//���� ����
	
	// ==== [SHA256 ���ڵ� - ���ڿ�] ====
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
	
	// ==== [SHA256 ���ڵ� - ����Ʈ] ====
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
	
}//Ŭ���� ����


import java.io.File;
import java.util.Scanner;

public class Hello { // class �տ� public �����ڰ� ������ ���ϸ�
	public static void main(String[] args) throws Exception {
		
		Scanner sc=new Scanner(new File("text"));
		int sum=0;
		int cnt=0;
		while(sc.hasNextInt()) {
			sum+=sc.nextInt();
			cnt++;
		}
		System.out.println(sum);
		System.out.println((double)sum/cnt);
	}
}

		// ctrl+shift+o import �޼��� �ڵ� �߰�
		// ctrl+shift+L ����Ű ��ü��Ϻ���
		// ctrl+ ��Ʈ ũ�� ����/����
		// ctrl+D �� �� ����
		// ctrl+alt+down ����� ����
		// alt+up, down ����� �̵�
		// alt+shift+A ��Ƽ�÷� ����
		// ctrl+i �ڵ� �鿩����
		// ctrl+/ �ּ�(���)
		// ctrl+space �ڵ��ϼ�
		
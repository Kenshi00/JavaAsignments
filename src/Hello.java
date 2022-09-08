import java.io.File;
import java.util.Scanner;

public class Hello { // class 앞에 public 제어자가 붙으면 파일명
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

		// ctrl+shift+o import 메서드 자동 추가
		// ctrl+shift+L 단축키 전체목록보기
		// ctrl+ 폰트 크기 증가/감소
		// ctrl+D 한 줄 삭제
		// ctrl+alt+down 행단위 복사
		// alt+up, down 행단위 이동
		// alt+shift+A 멀티컬럼 편집
		// ctrl+i 자동 들여쓰기
		// ctrl+/ 주석(토글)
		// ctrl+space 자동완성
		
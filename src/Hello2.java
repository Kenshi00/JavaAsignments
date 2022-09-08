public class Hello2{
	public static void main(String[] args) {
		Rectangle r1=new Rectangle(10,15);
		System.out.println(r1.area());
		
		Rectangle r2=new Rectangle(6,7);
		System.out.println(r2.area());
		
		System.out.println(Rectangle.numofobject);
		
	}
}

class Rectangle{
	double height=0, width=0;
	static int numofobject=0;
	Rectangle(double height,double width){
		this.height=height;
		this.width=width;
		numofobject++;
	}
	public double area(){
		return this.height*this.width;
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
		
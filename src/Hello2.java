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
		
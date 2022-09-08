package packageX;
import packageY.C;
// 이 과제의 접근 방법은 1. A,C 인스턴스가 어떤 변수에 접근할 수 있는지 확인하고 2. 추려진 그 변수를 바탕으로, 실제 변수가 존재하는 A 클래스와 다른 클래스들간의 관계를 비교
public class A{
	
	public int x;
	private int y;
	protected int z;
	
	public A objA; // class A와 C는 public class 이므로 다른 패키지더라도 포함관계로 접근 가능
	public C objC;
	void test() {
		this.x=1;
		this.y=2;
		this.z=3;
		objA.x=1; // A 참조변수니까 x,y,z 모두 일단은 접근 가능한데, class A에 속해 있으니까 x,y,z 모두 접근 가능
		objA.y=2;
		objA.z=3;
		objC.x=1; // C 참조변수니까 x,z 접근 가능인데, class A에 속해 있으니까 x,z 접근 가능 
		objC.y=2; 
		objC.z=3;
	}
}

class B{
	public A objA;
	public C objC;
	void test() {
		this.x=1;
		this.y=2;
		this.z=3;
		objA.x=1; // A 참조변수니까 일단 x,y,z 접근 가능한데, 같은 package 다른 class B에 속해 있으니까 y는 불가 -> x,z 접근 가능
		objA.y=2; 
		objA.z=3; 
		objC.x=1; // C 참조변수니까 일단 x,z 접근 가능, 같은 package(protected_z) 다른 class B에 속해 있으니까 -> x,z 접근 가능
		objC.y=2;
		objC.z=3;
	}
}

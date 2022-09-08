package packageY;
import packageX.A;

public class C extends A{
	
	protected int f;
	public A objA;
	public C objC;
	void test1() {
		this.x=1;
		this.y=2;
		this.z=3;
		objA.x=1; // A 참조변수니까 일단 x,y,z 접근 가능, class C와 class A는 다른 package 다른 class 이므로 private y 불가,
		objA.y=2; // 하지만 다른 package라도 class C는 class A의 자손이므로 원래는 protected z 접근 가능이지만,
		objA.z=3; // 외부 패키지에서 부모 A 클래스로 생성한 인스턴스로는 protected 접근불가, 부모 클래스로 생성한 인스턴스로는 안되나봄.. 부모참조변수는 안되고 자식참조변수만 됨.
		objC.x=1; 
		objC.y=2; // C 참조변수니까 일단 x,z 접근가능, 
		objC.z=3; // 상속받은 자손 C 클래스의 인스턴스로는 protected z 접근가능 -> 다른 패키지에서 protected를 활용할 때는 자식 인스턴스로 접근해야 하는듯 
	}
}

class D{
	public A objA;
	public C objC;
	void test() {
		this.x=1;
		this.y=2;
		this.z=3;
		objA.x=1; // A 참조변수니까 일단 x,y,z 접근 가능, 하지만 class D는 다른 package 다른 class 이므로 ->x만 가능
		objA.y=2;
		objA.z=3;
		objC.x=1; // C 참조변수니까 일단 x,z 접근가능, class D는 class A와 다른 package 다른 class 이므로 z 불가 ->x만 가능
		objC.y=2;
		objC.z=3;
		objC.f=4; // z,f 둘다 protected 인데 f는 되고 z는 안되는 이유는 z는 class C가 상속을 받긴 했지만 본적이 다른 패키지의 class A(부모)이기 때문임,
				  // 상속을 받았다고 class C 안에 protected int z; 이렇게 선언되어있는게 아니라는 소리임
		
	}
}
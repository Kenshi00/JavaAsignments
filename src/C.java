class B extends A{
	B(){
		System.out.println("Constructor B"); 
	}
}

public class C extends B {
	public static void main(String[] args){
		new C();
		new A();
		new B();	
	}
	
	C(){
		System.out.println("Constructor C");
	}
}
class A {
	A(){
		System.out.println("Constructor A");
	}
}
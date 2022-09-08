package java_final;

public class final_2 {
	public static void main(String arg[]) { 
		new A().info();
		new B().info();
		new C().info();
		new D().info();
	}
}

class A extends B{}

class B extends C{
	public void info() {
		System.out.println("B");
	}
}
class C extends D{
	
}
class D extends Object{
	public void info() {
		System.out.println("D");
	}
}

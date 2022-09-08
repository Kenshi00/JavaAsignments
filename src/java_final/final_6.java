package java_final;
// for commit
import java.util.Arrays;

public class final_6 {
	public static void main(String args[]) {
		try {
			System.out.println("outer try");
			try {
				System.out.println("inner try");
				throwMyException(10);
				System.out.println("Ending inner try");
			}catch(Exception e) {
				System.out.println(e.toString());
				throw e;
			}
			finally {
				System.out.println("It is finally");
			}
			System.out.println("ending try");
		}catch(Exception e) {
			System.out.println(e.toString());
		}
	}
	public static void throwMyException(int i) throws MyException {
		System.out.println("throws begin");
		throw new MyException(i+10);
	}
}
class MyException extends Exception{
	int e;
	MyException(int e) {
		this.e=e;
	}
	MyException(){}
	public String toString(){
		return "This value is "+e;
	}
}
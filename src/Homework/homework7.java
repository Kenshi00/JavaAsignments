package Homework;
// try catch를 통해서 예외처리를 잘 했으면 그 밑에 문장은 실행됨.!!
// 사실 throws를 안해도 알아서 던져지지만, 이런 오류가 날수있음을 명시해주는 것..
public class homework7 {
	public static void fun() throws MyException_C{ // purple code
		try {
			int i;
			System.out.println("FA");
			if(true)
				throw new MyException_C(); // green code
			if(true)
				throw new MyException_B();
			System.out.println("BA");
		}catch(MyException_B e) {
			System.out.println("P1 "+e.toString());
		}catch(MyException_A e) {
			System.out.println("P2 "+e.toString());
		}
		/* red code (insert finally clause here) */
		finally {
			System.out.println("In finally");
		}
		System.out.println("BC");
	}
	
	public static void main(String[] args) {
		try {
			System.out.println("A");
			fun();
			if(true)
				throw new MyException_B();
			System.out.println("B");
		}catch(MyException_B e) {
			System.out.println("P3 "+e.toString());
		}catch(MyException_A e) {
			System.out.println("P4 "+e.toString());
		}catch(Exception e) {
			System.out.println("P5 "+e.toString());
		}
		System.out.println("F");
	}
}


class MyException_A extends Exception{
	public String toString() {
		return "I am a MyException_A object";
	}
}

class MyException_B extends MyException_A{
	public String toString() {
		return "I am a MyException_B object";
	}
}

class MyException_C extends MyException_A{
	public String toString() {
		return "I am a MyException_C object";
	}
}
	
	
	
	
	
	
	

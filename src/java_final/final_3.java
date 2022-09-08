package java_final;

public class final_3 {
	public static void main(String arg[]) {
		String s1="welcome";
		String s2="welcome";
		String s3=new String("welcome");
		String s4=new String(s2);
		String s5=s1;
		System.out.println(s1==s2); // true
		System.out.println(s3==s4); // false
		System.out.println(s1.equals(s3)); // true - equals는 내용비교
		System.out.println(s4.intern()==s4); // false
		System.out.println(s5==s2); // true
		
	}
}

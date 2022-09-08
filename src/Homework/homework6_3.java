package Homework;

import java.util.Scanner;

public class homework6_3{
	public static void main(String arg[]) {
		System.out.println(trim("   abc         "));
		
	}
	public static String reverse(String s) {
		if(s.length()==0)
			return s;
		else
			return reverse(s.substring(1))+Character.toString(s.charAt(0));
	}
	public static String trimLeading(String s) {
		if((s.length()>0)&&(s.charAt(0)==' ')) {
			return trimLeading(s.substring(1));
		}
		else
			return s;
	}
	public static String trim(String s) {
		return trimLeading(reverse(trimLeading(reverse(s))));
	}
}

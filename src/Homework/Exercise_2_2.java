package Homework;
import javax.swing.JOptionPane;

class Exercise_2_2 {
    public static int readInt(String message) {
		// Prompt the user to enter a year
		String intAsString = JOptionPane.showInputDialog(null, message, "Number Input", JOptionPane.QUESTION_MESSAGE);
		// Convert the string into an int value
		return Integer.parseInt(intAsString);
	}

	public static void main(String[] args) {
		int a = readInt("Input the first number : ");
		int b = readInt("Input the second number: ");
		
		System.out.println("Result: " + check(a, b));
	}
	
	public static boolean check( int n1, int n2 ) {
		return check_range(n1) && check_range(n2) && share_digit( n1,  n2);
	}

	public static boolean check_range( int n) {
		return n >= 0 && n <= 1000;
	}

	public static boolean has_digit(int n, int d) {
		while (n > 0) {
			if (d == n % 10)
				return true;
			n = n / 10;
		}
		return false;
	}

	public static boolean share_digit(int n1, int n2) {
		while (n1 > 0) {
			if (has_digit(n2, n1 % 10))
				return true;
			n1 = n1 / 10;
		}
		return false;
	}

	public static void all_digit(int n) {
		while (n > 0) {
			int d = n % 10;
			n = n / 10;
			System.out.println(d);
		}
	}
}

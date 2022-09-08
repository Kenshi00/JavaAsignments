package Homework;
class Address {
	public String city;
	public int zipCode;
	private String street;

	public Address() {}

	public Address( String city, int zipCode, String street ) {
		this.city = city;
		this.zipCode = zipCode;
		this.street = street;
	}
	
	public void setStreet( String s ) {
		this.street = s;
	}

	public String getStreet() {
		return street;
	} 
	public void printAddress() {
		System.out.println("city " + city);
		System.out.println("zipCode " + zipCode);
		System.out.println("street " + street);
	}
}

class Person {
	String firstName;
	String lastName;
	Address address; 

	public String toString() {
		String text = "firstName " + firstName 
					+ "\nlastName " + lastName
					+ "\naddress city" + address.city
					+ "\naddress zipCode" + address.zipCode
					+ "\naddress street" + address.getStreet();
		return text;
	}
}

class Student extends Person {
	public int identificationNumber;
	public double absentTime;
	private double scoresMidtermExam;
	private double scoresFinalExam;

	public void setscoresMidtermExam( double v ) {
		this.scoresMidtermExam = (v <= 50 && v >= 0) ? v : 0;
	}

	public void setscoresFinalExam( double v ) {
		this.scoresFinalExam = (v <= 50 && v >= 0) ? v : 0;
	}

	public double scoresAltogether() {
		return this.scoresMidtermExam + this.scoresFinalExam;
	}

	public boolean passed() {
		return scoresAltogether() > 60;
	}
}

public class PersonProgram {
	public static void main(String[] args) {
		
	}
}
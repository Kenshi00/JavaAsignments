package Homework;
class Rectangle {
	double topLeftX, topLeftY, bottomRightX, bottomRightY;

	Rectangle() {
	}

	public Rectangle(Rectangle other) {
		this.topLeftX = other.topLeftX;
		this.topLeftY = other.topLeftY;
		this.bottomRightX = other.bottomRightX;
		this.bottomRightY = other.bottomRightY;
	}

	public Rectangle enclose(Rectangle r) {
		Rectangle returnedRectangle = new Rectangle();
		returnedRectangle.topLeftX = Math.min(this.topLeftX, r.topLeftX);
		returnedRectangle.topLeftY = Math.min(this.topLeftY, r.topLeftY);
		returnedRectangle.bottomRightX = Math.max(this.bottomRightX, r.bottomRightX);
		returnedRectangle.bottomRightY = Math.max(this.bottomRightY, r.bottomRightY);

		return returnedRectangle;
	}

	public void print() {
		System.out.print("TopLeft (X: " + this.topLeftX + ", Y: " + this.topLeftY + " ) ");
		System.out.println("BottomRight (X: " + this.bottomRightX + ", Y: "
							 + this.bottomRightY + " )");
	}
}

public class RectangleProgram {
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle();
		r1.topLeftX = 3;
		r1.topLeftY = 5;
		r1.bottomRightX = 10;
		r1.bottomRightY = 13;
		Rectangle r2 = new Rectangle();
		r2.topLeftX = 1;
		r2.topLeftY = 1;
		r2.bottomRightX = 8;
		r2.bottomRightY = 6;
		Rectangle r3 = new Rectangle();
		r3.topLeftX = 0;
		r3.topLeftY = 3;
		r3.bottomRightX = 12;
		r3.bottomRightY = 7;
		Rectangle r4 = new Rectangle();
		r4.topLeftX = 9;
		r4.topLeftY = 13;
		r4.bottomRightX = 12;
		r4.bottomRightY = 18;
		Rectangle r5 = r1.enclose(r2).enclose(r3).enclose(r4);

		r1.print();
		r2.print();
		r3.print();
		r4.print();
		r5.print();
	}
}


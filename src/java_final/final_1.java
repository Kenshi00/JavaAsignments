package java_final;

class C1{
	protected int x;
	private int y;
	public int z;
	C1 c1;
	C3 c3;
	void test() {
		this.x=1;
		this.y=1;
		this.z=1;
		c1.x=1;
		c1.y=1;
		c1.z=1;
		c3.x=1;
		c3.y=1;
		c3.z=1;
	}
	
}

class C2 extends C1{
	C1 c1;
	C3 c3;
	void test() {
		this.x=1;
		this.y=1;
		this.z=1;
		c1.x=1;
		c1.y=1;
		c1.z=1;
		c3.x=1;
		c3.y=1;
		c3.z=1;
	}
	
}

class C3 extends C1{
	C1 c1;
	C3 c3;
	void test() {
		this.x=1;
		this.y=1;
		this.z=1;
		c1.x=1;
		c1.y=1;
		c1.z=1;
		c3.x=1;
		c3.y=1;
		c3.z=1;
	}
}

class C4{
	C1 c1;
	C3 c3;
	void test() {
		this.x=1;
		this.y=1;
		this.z=1;
		c1.x=1;
		c1.y=1;
		c1.z=1;
		c3.x=1;
		c3.y=1;
		c3.z=1;
	}
}
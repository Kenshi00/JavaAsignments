package packageX;
import packageY.C;
// �� ������ ���� ����� 1. A,C �ν��Ͻ��� � ������ ������ �� �ִ��� Ȯ���ϰ� 2. �߷��� �� ������ ��������, ���� ������ �����ϴ� A Ŭ������ �ٸ� Ŭ�����鰣�� ���踦 ��
public class A{
	
	public int x;
	private int y;
	protected int z;
	
	public A objA; // class A�� C�� public class �̹Ƿ� �ٸ� ��Ű������ ���԰���� ���� ����
	public C objC;
	void test() {
		this.x=1;
		this.y=2;
		this.z=3;
		objA.x=1; // A ���������ϱ� x,y,z ��� �ϴ��� ���� �����ѵ�, class A�� ���� �����ϱ� x,y,z ��� ���� ����
		objA.y=2;
		objA.z=3;
		objC.x=1; // C ���������ϱ� x,z ���� �����ε�, class A�� ���� �����ϱ� x,z ���� ���� 
		objC.y=2; 
		objC.z=3;
	}
}

class B{
	public A objA;
	public C objC;
	void test() {
		this.x=1;
		this.y=2;
		this.z=3;
		objA.x=1; // A ���������ϱ� �ϴ� x,y,z ���� �����ѵ�, ���� package �ٸ� class B�� ���� �����ϱ� y�� �Ұ� -> x,z ���� ����
		objA.y=2; 
		objA.z=3; 
		objC.x=1; // C ���������ϱ� �ϴ� x,z ���� ����, ���� package(protected_z) �ٸ� class B�� ���� �����ϱ� -> x,z ���� ����
		objC.y=2;
		objC.z=3;
	}
}

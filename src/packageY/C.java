package packageY;
import packageX.A;

public class C extends A{
	
	protected int f;
	public A objA;
	public C objC;
	void test1() {
		this.x=1;
		this.y=2;
		this.z=3;
		objA.x=1; // A ���������ϱ� �ϴ� x,y,z ���� ����, class C�� class A�� �ٸ� package �ٸ� class �̹Ƿ� private y �Ұ�,
		objA.y=2; // ������ �ٸ� package�� class C�� class A�� �ڼ��̹Ƿ� ������ protected z ���� ����������,
		objA.z=3; // �ܺ� ��Ű������ �θ� A Ŭ������ ������ �ν��Ͻ��δ� protected ���ٺҰ�, �θ� Ŭ������ ������ �ν��Ͻ��δ� �ȵǳ���.. �θ����������� �ȵǰ� �ڽ����������� ��.
		objC.x=1; 
		objC.y=2; // C ���������ϱ� �ϴ� x,z ���ٰ���, 
		objC.z=3; // ��ӹ��� �ڼ� C Ŭ������ �ν��Ͻ��δ� protected z ���ٰ��� -> �ٸ� ��Ű������ protected�� Ȱ���� ���� �ڽ� �ν��Ͻ��� �����ؾ� �ϴµ� 
	}
}

class D{
	public A objA;
	public C objC;
	void test() {
		this.x=1;
		this.y=2;
		this.z=3;
		objA.x=1; // A ���������ϱ� �ϴ� x,y,z ���� ����, ������ class D�� �ٸ� package �ٸ� class �̹Ƿ� ->x�� ����
		objA.y=2;
		objA.z=3;
		objC.x=1; // C ���������ϱ� �ϴ� x,z ���ٰ���, class D�� class A�� �ٸ� package �ٸ� class �̹Ƿ� z �Ұ� ->x�� ����
		objC.y=2;
		objC.z=3;
		objC.f=4; // z,f �Ѵ� protected �ε� f�� �ǰ� z�� �ȵǴ� ������ z�� class C�� ����� �ޱ� ������ ������ �ٸ� ��Ű���� class A(�θ�)�̱� ������,
				  // ����� �޾Ҵٰ� class C �ȿ� protected int z; �̷��� ����Ǿ��ִ°� �ƴ϶�� �Ҹ���
		
	}
}
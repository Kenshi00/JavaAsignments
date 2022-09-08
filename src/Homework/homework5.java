package Homework;

public class homework5 {
	public static void main(String args[]) {
		_Character obj=new _Character();
		obj=new _Character();
		obj=new _Digit();
		obj=new _Digit();
		obj=new _Letter();
		obj=new _Letter();
		obj=new _Vowel(); // Vowel�� ȣ��Ǹ� �⺻�����ڰ� ����Ǵµ�, �׶� �ڵ����� super();�� ����Ǳ�
		obj=new _Vowel(); // ������ �ְ� ������ Character�� �⺻ �����ڰ� ������ ��
		obj=new _Consonant();
		obj=new _Consonant(); 
		System.out.println(_Character.objectCounter); 
	}
}


class _Character{
	
	protected char ch;
	static int objectCounter=0;
	{
		objectCounter++; // �����ڰ� ȣ��Ǳ� ������ �ʱ�ȭ ���� ȣ���.
	}
	_Character(){
	}
	_Character(char ch){
		this.ch=ch;
	}
	
	protected _Character plus(_Character arg) {// �ƽ�Ű �ڵ尡 A~Z=65~90, a~z=97~122
		return new _Character((char)((this.ch+arg.ch)%65+65));					   // ������ 65�̻����� ������ �ϰڴٴ°���
	}
	public void setter(char ch) {
		this.ch=ch;
	}
	public char getter() {
		return this.ch;
	}
	
}

class _Digit extends _Character{
	
	_Digit(){}
	_Digit(char ch){
		this.ch=ch;
	}
	protected _Character plus(_Character arg) {
		return new _Character((char)(((this.ch-'0')+(arg.ch-'0'))%10+48));
	}
	
	public void setter(char ch) { // setter method overriding
		if('0'<=ch&&ch<='9') { // 0~9�� �ް� �ƴ� ���� 0���� �ʱ�ȭ��
			this.ch=ch;
		}
		else {
			this.ch='0';
		}
	}
}

class _Letter extends _Character{}
class _Vowel extends _Letter{}
class _Consonant extends _Letter{}

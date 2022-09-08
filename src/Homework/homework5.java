package Homework;

public class homework5 {
	public static void main(String args[]) {
		_Character obj=new _Character();
		obj=new _Character();
		obj=new _Digit();
		obj=new _Digit();
		obj=new _Letter();
		obj=new _Letter();
		obj=new _Vowel(); // Vowel이 호출되면 기본생성자가 실행되는데, 그때 자동으로 super();가 실행되기
		obj=new _Vowel(); // 때문에 최고 조상인 Character의 기본 생성자가 실행이 됨
		obj=new _Consonant();
		obj=new _Consonant(); 
		System.out.println(_Character.objectCounter); 
	}
}


class _Character{
	
	protected char ch;
	static int objectCounter=0;
	{
		objectCounter++; // 생성자가 호출되기 직전에 초기화 블럭이 호출됨.
	}
	_Character(){
	}
	_Character(char ch){
		this.ch=ch;
	}
	
	protected _Character plus(_Character arg) {// 아스키 코드가 A~Z=65~90, a~z=97~122
		return new _Character((char)((this.ch+arg.ch)%65+65));					   // 무조건 65이상으로 나오게 하겠다는거임
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
		if('0'<=ch&&ch<='9') { // 0~9만 받고 아닌 경우는 0으로 초기화함
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

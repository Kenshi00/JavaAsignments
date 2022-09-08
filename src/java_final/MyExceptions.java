package java_final;

class MyException1 extends Exception {
   private String text;
   
   public MyException1(String text) {
      this.text = text;
   }	
     
   public String toString() {
      return "MyException1 / text : " + text;
   }
}

 class MyException2 extends Exception {
   public String toString() {
      return "MyException2";
   }
}

public class MyExceptions {
	
  public static void throwMyException1() throws MyException1 {
      throw new MyException1("..created by throwMyException1()");
  }
  
  public static void throwMyException2() throws MyException2 {
      throw new MyException2();
  }
  
  /** Main method */
  public static void main(String[] args) {
    try {
    	System.out.println("Try ....");
    	throwMyException1();
    	throwMyException2();
    }
    catch (MyException1 ex) { 
       System.out.println("Catch exception : " + ex);
    } 
    
    catch (MyException2 ex) { 
       System.out.println("Catch exception : " + ex);
    } 
    
    System.out.println("After catch blocks");
  }
}
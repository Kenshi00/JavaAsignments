package java_final;
public class RethrowExample {
  /** Main method */
  public static void main(String[] args) {
    // Try some code
    try {
    	System.out.println("Outer try ....");
    	
    	try {       
	   System.out.println("Inner try ....");
	   Exception e = new Exception();
           throw e;
    	}
    	catch (Exception ex) { 
           System.out.println("(Inner try-catch) Catch exception : " + ex);
      	   System.out.println("Rethrow : ");
      
           throw ex; // WE RETHROW ex
        }  // end of inner try - catch
        
        // Example of a finally clause
        finally {
           System.out.println("The finally clause ...");
        }
	
	// System.out.println("After the inner catch block");
    }
    catch (Exception ex) { 
       System.out.println("(Outer try-catch) Catch exception : " + ex);
    } 
    
    System.out.println("After the outer catch block");
  }
}
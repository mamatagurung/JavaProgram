package test;

public class TryCatch {
	
	public static void main(String[] args) {
		
		//common error handling
		//using try and catch block
		
		try {
			System.out.println("error handling in java");
		} catch (Exception e) {
			
			e.printStackTrace();//this block have no error
			
		}
		
		
			try {
				int a = 10, b = 0;
				int c = a/b;
			} catch (Exception e) {
				
				System.out.println("the error is "+e.getMessage());
			}
			
			
		}	

}

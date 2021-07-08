package test;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		try {
//			int a = 100/0;
//		}catch(Exception e){
//			
//			System.out.println("the error is "+e.getMessage());
//		
//		}
		
		//try and catch example 2
		try {
			int[] myNumbers = {1,2,3};
			System.out.println(myNumbers[10]);
		} catch(Exception e) {
			
			System.out.println("something went wrong");
			// to print the exception 
			System.out.println("The error is "+e.getMessage());
		}

	}

}

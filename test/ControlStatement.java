package test;

public class ControlStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//	int age = 3;
//	if(age>=18) 
//		System.out.println("you are eligible for voting.");  // no braces it treats the next line after if statement as another piece of code
//	System.out.println("check");
//
//		int num = 34;
//	boolean b = (num%2 == 0)?false:true;      //use of ternary operator
//	if(b == false) {
//		System.out.println("even number");
//	}else
//		System.out.println("odd number");
		//switch statement
		//case variable should be int, short, byte, char or enumeration
//		int choice = 7;
//		switch(choice) {
//		case 1:
//			System.out.println("First");
//		break;
//		case 2:
//			System.out.println("Second");
//			System.out.println("check");
//			break;
//		case 3:
//			System.out.println("Third");
//			break;          //break is optional, if it not given it executes the next statement after the condtion are met
//		default:
//			System.out.println("Default is optional");
//		}	
//		
		//String type is also supported since version 7 of Java
		String cmd = "fetch";
		switch(cmd) {
		case "fetch":
			System.out.println("Data is fetched");
			break;
		case "read":
			System.out.println("Data is read");
			break;
		case "write":
		System.out.println("Data is written");
		break;
		default:
		System.out.println("No such command");
				
		
		
		}
}
}

package test;

public class SimpleCalculator {

	public static void main(String[] args) {
		System.out.println("Enter the operator:");
		char ch = '+';
		int a = 45, b = 65;
		int c = 0;
		switch(ch) {
		case '+':
			c = a+b;
			break;
		case '-':
			c = a-b;
			break;
		case '*':
			c = a*b;
		case '/':
			c = a/b;
			break;
		default:
			System.out.println("Please Enter correct operator");
		}
		System.out.println("Result is "+c);

		
	}

}

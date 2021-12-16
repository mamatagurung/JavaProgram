package test;

public class Calculator {

	public int calculator(int a, int b,char c) {
		switch(c) {
		case '+':
			return a+b;
	
		case '-':
			return a-b;
			
		case '*':
			return a*b;
			
		case '/':
			return a/b;
			
		default:
			System.out.println("Enter correct operator.");
			
				return 0;
				
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a= 35, b=65;
		char c = '/';
		Calculator obj = new Calculator();
		obj.calculator(a, b, c);
		
		

	}

}

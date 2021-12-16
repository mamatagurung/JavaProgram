package test;

public class ReverseOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 34;
		int sum = 0;
		do {
		sum = sum*10 +n%10;
		n = n/10;
		}while(n!=0);
		System.out.println("The reverse is "+sum);
		
		

	}

}

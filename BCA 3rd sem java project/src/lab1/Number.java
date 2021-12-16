package lab1;

public class Number {

	private double num;
	boolean isZero(int n){ 
		if(n == 0) {
			return true;
		}
		else return false;
	}
	boolean isPositive(int n) {
		if(n>0) {
			return true;
		}else return false;
	}
	boolean isNegative(int n) {
		if(n<0) {
			return true;
		
		}
		else return false;
	}
	boolean isOdd(int n) {
		if(n%2 == 1) {
			return true;
		}
		else return false;
	}
	boolean isEven(int n) {
		if(n%2 == 0) {
			return true;
		}
		else return false;
	}
	boolean isPrime(int n) {
		int number= n/2;
		for(int i=2;i<=number;i++)
		{
			if(n%i == 0) {
				return false;
			}
		}
		return true;
	}
	boolean isArmstrong(int n) {
		int num = n; int sum = 0;
		int count = 1;
		while(num != 0) {
			num /= 10;
			count ++; 
		}
		while(num != 0) {
			sum = sum + 
		}
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Number obj = new Number();
System.out.println(obj.isPrime(12));

	}

}

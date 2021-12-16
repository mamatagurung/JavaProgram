package test;

public class SumOfDigits {

	public int sum(int n) {
		int sum = 0;
		while(n!=0) {
			sum = sum + n%10;
			n = n/10;
		}
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =12345;
		SumOfDigits obj = new SumOfDigits();
		System.out.println(obj.sum(n));
		

	}

}

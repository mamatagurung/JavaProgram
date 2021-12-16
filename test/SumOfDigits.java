package test;

public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 36453;
		int sum = 0;
//		while(num != 0) {
//			sum += num%10;
//			num = num/10;
//			System.out.println("check");
//			
//		}
	
		while(num>0)
		{
			sum += num%10;
			num = num/10;
			System.out.println("check");
			
		}
		System.out.println("The sum of digits of given number is "+sum);
	}

}

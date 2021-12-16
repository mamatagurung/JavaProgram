package test;

public class OddEven {
	public static void checkOddEven(int n) {
		if(n%2 == 0) {
			System.out.println("The number "+n+" is even.");
		}else
			System.out.println("The number "+n+"is even");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 54;
		checkOddEven(num);

	}

}

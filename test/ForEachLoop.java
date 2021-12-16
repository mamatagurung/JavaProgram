package test;

public class ForEachLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {12,53,54,78};
		int sum = 0;
		for(int i:arr) {
			sum = i + sum;
			System.out.println(sum);
		}
		

	}

}

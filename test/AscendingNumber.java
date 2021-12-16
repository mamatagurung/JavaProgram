package test;

public class AscendingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {23,54,11,87,34,22};
		int temp;
		for(int i = 0 ;i<arr.length-1;i++) {
			for(int j = i+1; j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("After arranging the array in ascending order.");
		for(int i = 0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}

}

package lab1;

public class ReturnIndex {
 static int k = 0, l = 1;
int[] finder(int[] arr) {
	int[] n = new int[10]  ;
	
	for(int i=0; i<arr.length-1;i++) {
		for(int j= i+1;j<arr.length;j++) {
			if(arr[i]+arr[j] == 5) {
				
					n[k] = i;
					n[k+1] = j;
					k+=2;
					
			}
		}
	}
	return n;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,3,4,5,1,3};
		ReturnIndex obj = new ReturnIndex();
		int[] arr2 = obj.finder(arr);
		for(int i = 0;i<arr2.length;i++) {
			System.out.print(arr2[i] + " ");
		}

	}

}

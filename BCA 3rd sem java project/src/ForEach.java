
public class ForEach {

	public static void main(String[] args) {
		int a[]= { 10,20,30,40,50};
		int b[]= { 2,3,4,5};
//	System.out.println(a.length);
//	System.out.println(a[3]);
// for(int i=0; i<=a.length; i++) {
//	 System.out.println(a[i]);
//
// }

	for(int i:a) {
		System.out.println(i);
	}
	for(int i:b) {
		System.out.println(i);
	}
	}
}


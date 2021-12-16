package test;

public class PyramidPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j;
		for(i=1;i<=5;i++) {
			for(j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		int k,l;
		for(k = 1;k<=5;k++) {
			for(l = 5;l>=i;l--) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}

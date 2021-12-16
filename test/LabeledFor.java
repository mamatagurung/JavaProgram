package test;

public class LabeledFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i ;
		label:
			for(i=1;i<=5;i++) {
				for(int j = 1;j<=5;j++) {
					if((i==2)&&(j==2)) {
						break label;
					}
					System.out.println(i+" "+j);
				}
			}

	}

}


public class ThisIsFun {
	int a;
	int b;
	public void setData(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			ThisIsFun obj = new ThisIsFun();
			obj.setData(4,3);
		System.out.println(obj.a);
		System.out.println(obj.b);
		

	}

}

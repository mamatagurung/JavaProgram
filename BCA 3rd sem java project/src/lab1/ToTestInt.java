package lab1;
interface test{
	 int square(int n);
}
// test is implemented in Arithmetic class
class Arithmetic implements test{
public int square(int n) {
	return n*n;
}
}

public class ToTestInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Arithmetic obj = new Arithmetic();
		 System.out.println("The square root of 5 is "+obj.square(5));

	}

}

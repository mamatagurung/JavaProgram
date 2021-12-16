package lab1;
public class Exception{

	void method1() 
	{
		Exception obj = new Exception();
		
		try {
			obj.method2();
		} catch (ArithmeticException ae) {
			// TODO Auto-generated catch block
			System.out.println("exception is handled");
			System.out.println(ae);
			
		}
		finally {
			System.out.println("finally block is executed");
		}
		
	}
	void method2() 
	{
		Exception obj1 = new Exception();
		obj1.method3();
		System.out.println("Method 2");
	}
	void method3()
	{
		
		int num = 45/0;
	System.out.println(num);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exception obj2 = new Exception();
		obj2.method1();
		
		

	}

}

package test;

public class InstanceMethodExample {
int sum;
static int num;   //a static varaible is created onetime and run lifetime for the code
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InstanceMethodExample obj = new InstanceMethodExample();
//		 obj.sum = obj.add(34, 55);
//		 System.out.println(obj.sum);
		num = 34;
	method();

	}
	
	public int add(int a, int b) {
		System.out.println(sum);
		num = 4;
		return a+b;
	}
	static void method() {
		InstanceMethodExample obj = new InstanceMethodExample();
		obj.sum = 23;    //static method is not able to use instance variable, however instance method can use it
	num = 45;
		System.out.println(obj.sum);
	}

}

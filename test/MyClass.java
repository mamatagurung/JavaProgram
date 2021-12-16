package thirdpractice;
abstract class Demo{
	abstract void display();
}

public class MyClass {
	void display()  
	{  
	System.out.println("Abstract method?");  
	}  
	public static void main(String args[])  
	{  
	//creating object of abstract class  
	MyClass obj = new MyClass();  
	//invoking abstract method  
	obj.display();  
	}  
}

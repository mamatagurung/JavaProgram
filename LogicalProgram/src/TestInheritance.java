class Animal{
	void eat() {
		System.out.println("eating...");
		
	}
	void sleep() {
		System.out.println("sleeping");
	}
}
class Dog extends Animal{
	void run() {
		System.out.println("running");
	}
	void sleep() {
		System.out.println("The dog is sleeping.");  //runtime Polymorphism or method overriding
	}
	void rest() {
	super.sleep();
}}
public class TestInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Dog obj = new Dog();
obj.sleep();
Animal obj1 = new Animal();
obj1.eat();
obj.rest();
System.out.println(obj instanceof Dog );
	
	}

}
class hello extends Animal{
	public static void main(String args[]) {
		System.out.println("hello world");
	}
}

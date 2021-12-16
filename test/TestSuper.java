package thirdpractice;
class Person{
	int age = 65;
	String name;
	void eat() {
		System.out.println("Eating...");
	}
}
class Employee extends Person{
	void eat(){
		System.out.println("Company dinner");
	
	
} 
	void work() {
		super.eat();
		System.out.println(super.age);
	}
	}

public class TestSuper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person obj = new Person();
		obj.eat();
		

	}

}

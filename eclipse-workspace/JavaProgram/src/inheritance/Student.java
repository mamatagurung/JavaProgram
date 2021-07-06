package inheritance;

public class Student extends Person{
	String name;
	int age;
	String address;
	int className;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Student std = new Student();
       System.out.println(std.getAddress());
}
}

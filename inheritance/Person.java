package inheritance;

public class Person {
	private String name = "Hari";
	private int age = 23;
	private String address= "Putalisadak";
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
		
	}
	
	public String getAddress() {
		return address;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person = new Person();
		System.out.println(person.getAge());
	}
}

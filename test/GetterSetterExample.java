package thirdpractice;

public class GetterSetterExample {
//getter method or accessor method
	int id=1;  //lets suppose a primary key
	String name;
	public int getID() {
		return id;
	}
	//setter method or mutator method
	public void setName(String name) {
		this.name = name;
	}
	public static void main(String args[]) {
		GetterSetterExample obj = new GetterSetterExample();
		int intial = obj.getID();
		obj.setName("Mamata");
		System.out.println("Id = "+intial+" Name = "+obj.name);
	}
}

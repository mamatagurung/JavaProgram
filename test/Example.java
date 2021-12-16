package test;
class Method{
	int i ;
	String name ;
	void insertRecord(int a,String n) {
		i = a;
		name = n;
	}
	void displayInformation() {
		System.out.println(i+" "+name);
	}
}
public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Method obj = new Method();
		obj.insertRecord(12,"Mamata");
		obj.displayInformation();
	}

}

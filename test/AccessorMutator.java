package test;

public class AccessorMutator {

	int num;
	String name;
	private int age;
	private String password = "abcdef";
	public String getInput() {
		return password;
	}
	public int setInput(int n, String pass) {
		this.password = pass;
		this.age = n;
		return age;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccessorMutator obj = new AccessorMutator();
		System.out.println( obj.getClass());
		System.out.println(obj.password);
		System.out.println(obj.setInput(13," P@ssword"));

	}

}

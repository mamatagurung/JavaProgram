package test;
public class Puppy {
	int puppyAge;
	private String str = "Woof Woof!!!";
	  public Puppy(String name) {
		  System.out.println("Passed name is: "+name);
	  }
	  public void age(int age) {
		  puppyAge = age;
	  }
	  public int getAge() {
		  System.out.println("Puppy age is : "+puppyAge);
		  return puppyAge;
	  }
	  public static void main(String args[]) {
		  Puppy mypuppy = new Puppy("Rome");
		  System.out.println(mypuppy.str);
		 mypuppy.age(23);
		 int localage = mypuppy.getAge();
		 System.out.println(localage);
	  }
	}
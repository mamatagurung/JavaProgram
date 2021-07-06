package abstraction;

public abstract class Phone {
	
	public void call() {
		System.out.println("calling .....");
	}

	public  abstract void camera();
		
	
}
class Samsung extends Phone{
	public void camera() {
		System.out.println("camera is working");
		
	}
}
class Iphone extends Phone{
	public void camera() {
		System.out.println("Iphone camera is working");
	}
	
}
class calling{
	
	public static void main(String[] args){
	Phone samsung = new Samsung();
    samsung.camera();
}
}


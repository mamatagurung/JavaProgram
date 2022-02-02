package one;

class Box{
	int length;
	int breadth ;
	int height;
	
	Box(){
		System.out.println("Constructor called");
	}
	
}
public class Box3d extends Box{
	Box3d(int length, int breadth, int height){
		this.length = length;
		this.breadth = breadth;
		this.height = height;
		}
	public Box3d(){
	System.out.println("Consturctor called");
	}
	int volume(){
		return length*breadth*height;
	}
	int area() {
		return 2*(length*breadth+length*height+breadth*height);
	}
	
public static void main(String args[]) {
	Box3d obj = new Box3d(4,6,8);
	System.out.println("the volume of Box3d is "+obj.volume());
	System.out.println("The area of Box3d is "+obj.area());
}
}

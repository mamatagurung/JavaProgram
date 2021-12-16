package lab1;
class Box{
	int lenght=5 ;
	int breadth=7 ;;
	
	
}
public class Box3d extends Box{
	int height =9;
	int volume(){
		return lenght*breadth*height;
	}
	int area() {
		return 2*(lenght*breadth+lenght*height+breadth*height);
	}
	
public static void main(String args[]) {
	Box3d obj = new Box3d();
	System.out.println("the volume of Box3d is "+obj.volume());
	System.out.println("The area of Box3d is "+obj.area());
}
}

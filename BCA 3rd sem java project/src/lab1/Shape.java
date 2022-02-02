package lab1;

public class Shape {
void draw(){
	System.out.println("shape draw");
}
void erase() {
	System.out.println("shape erase");
	
}

}
class Circle extends Shape{
	void draw() {
		System.out.println("Circle is drawn");
	}
	void erase() {
		System.out.println("Circle is erased");
	}
}
class Triangle extends Shape{
	void draw() {
		System.out.println("Triangle is drawn");
	}
	void erase() {
		System.out.println("Triangle is erased");
	}
}
class Square extends Shape{
	void draw() {
		System.out.println("Square is drawn");
	}
	void erase() {
		System.out.println("Square is erased");
	}
}

package test;

 class Rectangle{
	
	int length;
	int width;
	void insert(int l, int w) {
		length = l;
		width = w;
	}
	void calculateArea() {
		System.out.println(length*width);
	}

	
}
class RectangleArea{
	public static void main(String args[]) {
		Rectangle	 obj = new Rectangle(),obj2 = new Rectangle();  //creating 2 objects by one type only
		obj.insert(12, 343);
		obj.calculateArea();
		new Rectangle().insert(23,54);  //calling method through anonymous object
		new Rectangle().calculateArea();
	}
}

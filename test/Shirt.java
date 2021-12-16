package test;

public class Shirt {
	private static String color;
	private  static char size;
	Shirt(){
		System.out.println("inside constructor");
	}
	public static void putOn() {
		System.out.println("Shirt is on!");
	}
	public static void takeOff() {
		System.out.println("Shirt is off!");
	}
	public static void setColor(String newColor) {
		color = newColor;
	}
	public static void setSize(String newSize) {
		color = newSize;
	}
	

}

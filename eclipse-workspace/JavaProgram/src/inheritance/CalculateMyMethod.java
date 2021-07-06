package inheritance;

public class CalculateMyMethod {
	//using Static keyword 
		public static int add(int x, int y) {
			return x+y;
		}
		static int mul(int x, int y) {
			return x*y;
		}
		
		public static void main(String... args){
			System.out.println(add(2,4));
			System.out.println(mul(2,4));
		}
}

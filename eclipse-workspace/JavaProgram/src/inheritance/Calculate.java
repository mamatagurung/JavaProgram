package inheritance;

public class Calculate {
	//By creating an object
		int add( int x, int y)
		{
			return x+y;
		}

		public static void main(String[] args) {
			Calculate calc = new Calculate();
			System.out.println(calc.add(5, 8));
		}
}

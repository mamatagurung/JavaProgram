package test;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//a leap year is year that is evenly divisible by 4
		int year = 1988;
		if((year % 4 == 0) && (year % 100 != 0) ||(year%400 == 0 )) {
			System.out.print(year);
			System.out.println(" is a leap year");
		}else 
			System.out.println("It is a leap year");

	}

}

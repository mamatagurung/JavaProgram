package lab1;
import java.lang.*;
public class Exercise {
	boolean isBoolean(int n) {
		int num = n;
		int number = n;
		int count = 0;
		int sum = 0, rem;
		while(num != 0) {
			num /= 10;
			count += 1; 
			System.out.println(num);
		}
		while(number != 0) {
			rem = number%10;
			sum += Math.pow(rem, count);
			number /= 10;
			System.out.println(sum);
		}
		System.out.println();
		if(sum == n) {
			return true;
		}
		else return false;
	}
	public static void main(String args[]) {
		Exercise ob = new Exercise();
		int x = 153;
		System.out.println(ob.isBoolean(x));
	}

}

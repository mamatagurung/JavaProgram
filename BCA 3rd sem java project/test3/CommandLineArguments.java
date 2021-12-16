package test;

public class CommandLineArguments {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sum = " ";
		for(int i= 0;i<args.length;i++) {
		sum = sum + args[i];
			System.out.println(args[i]);
		} 

	}

}

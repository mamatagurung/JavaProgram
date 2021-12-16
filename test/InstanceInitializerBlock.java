package thirdpractice;

public class InstanceInitializerBlock {

	int speed;
	
	//instant initializer block
	
	InstanceInitializerBlock(){
		System.out.println("constructor block");
	}
		
	
		{speed = 56;
			System.out.println("InstanceInitializerBlock");}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InstanceInitializerBlock obj = new InstanceInitializerBlock();
		

	}

}

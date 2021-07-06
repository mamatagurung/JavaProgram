package inheritance;

public class Teacher {
	
	private int noOfPeriods = 3;
	
	public int getnoOfPeriods() {
		return noOfPeriods;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Teacher teacher = new Teacher();
		System.out.println(teacher.getnoOfPeriods());

	}

}

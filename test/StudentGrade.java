package test;

public class StudentGrade {

	public static void main(String[] args) {
		float eng = 87, math = 80, acc = 90, nep = 60, sci = 86;
		float marks = (eng+math+acc+nep+sci);
		float per = marks/5;
		//Java Program to demonstrate the use of If else-if ladder.  
		//It is a program of grading system for fail, D grade, C grade, B grade, A grade and A+.
if((eng>=40)&&(math>40)&&(acc>=40)&&(nep>=40)&&(sci>=40)) {
	if(per>=90) {
		System.out.println("Congratulaion!!! A+");
	}
	else if((per>=80)&&(per<90)) {
		System.out.println("A");
	}
	else if((per>=70)&&(per<80)) {
		System.out.println("B");
	}
	else if((per>=60)&&(per<70)) {
		System.out.println("C");
	}
	else if((per>=50)&&(per<60)) {
		System.out.println("D");
	}
	
}else
	System.out.println("failed");


	}

}

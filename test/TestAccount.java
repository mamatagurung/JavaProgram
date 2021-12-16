package test;
//Java Program to demonstrate the working of a banking-system  
//where we deposit and withdraw amount from our account.  
//Creating an Account class which has deposit() and withdraw() methods  
class Account{
	int AccNo;
	String name;
	float amount;
	void insert(int i,String n,float a) {
		AccNo = i;
		name = n;
		amount = a;
	}
	void deposit(float amt) {
		amount = amt + amount;
			
	}
	void withdraw(float amt) {
		if(amt>amount) {
			System.out.println("Insufficient Balance");
		}else
			amount = amount - amt;
		System.out.println("Withdrawn amount is "+amt);
	}
	void display() {
		System.out.println(AccNo+" "+name+" "+amount);
	}
	void checkBalance() {
		System.out.println("Your current balance is "+amount);
	}
}

public class TestAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account obj = new Account();
		obj.insert(02312,"Mamata",9000);
		obj.deposit(4000);
		obj.withdraw(5000);
		obj.display();
		obj.checkBalance();
		Math.sqrt(34);

	}

}

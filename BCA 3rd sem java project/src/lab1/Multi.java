package lab1;
import java.io.*;
import java.lang.Thread;
public class Multi extends Thread{
public void run() {
	 try {
         for (int i = 0; i < 5; i++) {
             
             // it will sleep the main thread for 1 sec
             // ,each time the for loop runs
             Thread.sleep(1000);
             
             
             // printing the value of the variable
             System.out.println(i);
         }
        
     }
     catch (Exception e) {
         
         // catching the exception
         System.out.println(e);
     }
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Multi obj = new Multi();
		obj.run();
		

	}

}

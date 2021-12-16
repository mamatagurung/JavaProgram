package lab1;
import java.io.*;
import java.lang.Thread;
  
class GFG {
    public static void main(String[] args)
    {
        // we can also use throws keyword foloowed by
        // exception name for throwing the exception
        
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
}
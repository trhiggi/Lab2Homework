
import java.util.Scanner;


public class SumofNumbers {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
         // ask user for their number
    System.out.println("Please enter a Positive number greater than 0");
    
         // Take the number as an integer
         int numberEntered = keyboard.nextInt();
         
         // do the math
         int sum = 0;
         for (int counter = 0; counter<= numberEntered; counter++){
             sum +=counter;
         }
         //Display output to the user
         System.out.println("The Sum is " + sum);
    }
    

    
}

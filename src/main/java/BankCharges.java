
import java.util.Scanner;


public class BankCharges {
    public static void main(String[] args) {
        double fees = 0;
        Scanner keyboard = new Scanner(System.in);
        // ask the user for the number of checks he wrote
        System.out.println("Please enter the number of checks you have written this month");
        // gather that number as an integer
        int NumofChecks = keyboard.nextInt();
        //calculate the fees with an if statement
        if (NumofChecks < 20)
           fees = NumofChecks *.10 + 10;
        else if (NumofChecks >=20 && NumofChecks < 40)
            fees = NumofChecks *.08 + 10;
        else if (NumofChecks >=40 && NumofChecks < 60)
            fees = NumofChecks *.06 + 10;
        else 
            fees = NumofChecks *.04 + 10;
        // display the results to the user
        System.out.println("Your total bank fees are " + fees);
    }
}

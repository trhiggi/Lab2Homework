import java.util.Scanner;


public class GradesProject {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
     
        System.out.println("Please enter test score 1");
        double test1 = keyboard.nextDouble();
        System.out.println("Please enter test score 2");
        double test2 = keyboard.nextDouble();
        System.out.println("Please enter test score 3");
        double test3 = keyboard.nextDouble();
   
        double average = (test1 + test2 + test3) / 3;
        // assign the grade to a letter grade
        if (average >= 90)
            System.out.println("A" + average);
        else if(average < 90 && average >= 80)
            System.out.println("B" + average);
        else if (average < 80 && average >= 70)
            System.out.println("C" + average);
        else if (average < 70 && average >=60)
            System.out.println("D" + average);
        else 
            System.out.println("F" + average);
     }      
}
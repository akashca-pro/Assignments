//Write a program to print the sum of negative numbers, sum of positive even numbers and the sum of positive odd numbers from a list of numbers (N) entered by the user. The list terminates when the user enters a zero.
import java.util.Scanner;

public class Assignment26 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int sumOfPositiveOdd =0;
        int sumOfNegative=0;
        int sumOfPositiveEven =0;

        while(true) // loop until user stop adding numbers and press zero
        {
            System.out.println("Enter number 0 to Exit ");
            System.out.println("Enter the numbers to find sum");
            int number=in.nextInt(); // Entered number is stored in here
            if(number==0)
                break;
           if (number>0) {
                if(number%2==0)
                    sumOfPositiveEven += number;
                else
                    sumOfPositiveOdd += number;
            }else
                sumOfNegative+=number;

        }
        System.out.println("Positive odd numbers");
        System.out.println(sumOfPositiveOdd);
        System.out.println("Positive Even numbers");
        System.out.println(sumOfPositiveEven);
        System.out.println("Negative numbers");
        System.out.println(sumOfNegative);
    }
}

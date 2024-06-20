import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        System.out.println("Enter x to stop the program");

        int ans=0;
        while(true)
        {
            System.out.print("Enter the operator");
            char op=in.next().trim().charAt(0);
            if(op == '+' || op == '-'|| op == '*'|| op== '/' || op== '%') {
                System.out.println("Enter two numbers for calculation");
                int num1 = in.nextInt();
                int num2 = in.nextInt();
                if (op == '+') {
                    ans = num1 + num2;
                } else if (op == '-') {
                    ans = num1 - num2;
                } else if (op == '*') {
                    ans = num1 * num2;
                } else if (op == '/') {
                    ans = num1 / num2;
                } else if (op == '%') {
                    ans = num1 % num2;
                }
            }
            else if (op == 'x' || op == 'X') {
                break;
            }
            else
            {
                System.out.println("Invalid operator");
            }
            System.out.println(ans);
        }
    }
}

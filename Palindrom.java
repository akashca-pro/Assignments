import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the String");
        String str =in.next();
        int first = 0;
        int  last = str.length()-1;
        int flag=0;

        for (int i = 0 ; i < str.length(); i++) {
            if(str.charAt(first)!=str.charAt(last))
                flag=1;
            first++;
            last--;

        }
        if(flag==0)
            System.out.println("It is palindrome");
        else
            System.out.println("It is not palindrome");
    }
}


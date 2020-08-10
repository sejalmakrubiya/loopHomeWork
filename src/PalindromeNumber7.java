import java.util.Scanner;

public class PalindromeNumber7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    /*7.wap to input any number and check if it is palindrome or not.A palindrome number
    is a number that remains the same when its digits are reversed for example,55 and
    121 is a palindrome number */
        System.out.print("Enter any number to check of it is palindrome number: ");
        int number = scanner.nextInt();
        int temp = number;
        int rem ;
        int reverse = 0;
        while (number>0) {
            //to find out reminder
            rem = number % 10;
            //add reminder into sum
            reverse = reverse * 10 + rem;
            //change value of number variable
            number = number / 10;
        }
        if (temp == reverse) {
            System.out.println(  " is palindrome number");
        } else {
            System.out.println( " is not palindrome number");
        }

    }
}

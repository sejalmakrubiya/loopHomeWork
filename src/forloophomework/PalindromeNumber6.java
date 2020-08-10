package forloophomework;

import java.util.Scanner;

public class PalindromeNumber6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    /*6.Wap to input any number and check if it is palindrome or not
       (number that is same after reverse example 545,151,34371)*/

        System.out.print("Enter any number to check if it is a palindrome number or not : ");
        int number = scanner.nextInt();
        int sum = 0, reminder;
        int temp =number;
        for (;number > 0;){
            reminder = number % 10;
            sum = (sum * 10) + reminder;
            number = number / 10;
        }
        if (temp == sum) {
            System.out.println("It is a palindrome number. ");
        } else {
            System.out.println("Not a palindrome");
        }
    }
}

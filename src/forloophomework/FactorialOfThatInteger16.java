package forloophomework;

import java.util.Scanner;

public class FactorialOfThatInteger16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    //create a function that takes an integer and returns the factorial of that integer.
    //factorial number is that multiplied by all positive lower integers.
        System.out.print("Enter any number to know its factorial: ");
        int number = scanner.nextInt();

        int fact=1;
        for (int i=2; i<=number;i++){
            fact*=i;

        }
        System.out.println("Factorial of "+number+" is : "+fact);
    }
}

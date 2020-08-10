package forloophomework;

import java.util.Scanner;

public class NaturalNumberAndtheirSum1 {
    public static void main(String[] args) {
        //1.Write a program in java to display n limit of natural numbers and their sum
        Scanner scanner = new Scanner(System.in);
        int i ;
        int sum = 0;


        System.out.print("Enter any number to display n limit of  natural numbers  = ");
        int number =scanner.nextInt();


        for( i=1; i<=number; i++) {
            System.out.println(i);
            sum+=i;

        }
        System.out.println("Sum of natural numbers are = "+ sum);
    }
}

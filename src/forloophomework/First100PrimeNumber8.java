package forloophomework;

import java.util.Scanner;

public class First100PrimeNumber8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    //8.Wap TO display first  n or first 100 prime numbers
        //a number which is divided by only its self and 1 is prime number

        System.out.print("Enter any number to check first n prime numbers = ");
        // the entered value is stored in the n
        int number;
        int num = 0;
        int status = 0;

        number= scanner.nextInt();
        if (number >= 0) {
            System.out.println("first"  +  number +  "prime numbers are : ");
        }
        for (int i =2; i <= number;) {
            for (int j =2; j <= num/2; j++) {
               if (num % j == 0) {
                   status = 0;
                   break;
               }

            }
            if (status != 0) {
                System.out.println(num);
                i++;}
            status = 1;
            num++;
        }

    }
}
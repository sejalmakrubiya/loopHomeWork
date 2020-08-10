package forloophomework;

import java.util.Scanner;

public class FibonacciSeries4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //4. print the sequence 1 1 2 3 5 8 13 21 ( fibonacci number)

        System.out.print("Please enter maximum number to see fibonacci series = ");

        int maxNumber = scanner.nextInt();
        int previousNumber = 1;
        int nextNumber = 1;



        for (int i = 1;  i <= maxNumber;  ++i){

            System.out.print(previousNumber+" ");
            /*on each iteration, assigning second number
            *to the first number and assigning the sum of
            * last two number to the second number
             */

            int sum = previousNumber + nextNumber;
            previousNumber = nextNumber;
            nextNumber = sum;
        }
    }

    }


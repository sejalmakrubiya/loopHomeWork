package forloophomework;

import java.util.Scanner;

public class TringleWithNumber2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //2.Write a program in java to display the pattern like triangle with a number.


        System.out.print("Input number of rows for  triangle with  numbers = ");
        int number = scanner.nextInt();
        //for printing the numbers
        for (int i=1;i<=number;i++) {
            //for spaces
            for (int k=number-1;k>=i;k--) {
                System.out.print("  ");

            }//increasing the value
            for (int j=1;j<=i;j++) {
                System.out.print(j + " ");
            }
            //for going in next line
            System.out.println("");
        }

    }


}
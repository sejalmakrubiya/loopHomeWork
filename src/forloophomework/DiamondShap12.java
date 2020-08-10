package forloophomework;

import java.util.Scanner;

public class DiamondShap12 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        /*12. Write a program in java to display the pattern like a diamond.
        while loop */

        int i,j,row;

        System.out.print("Input number of rows (half of the diamond) = ");

        row =scanner.nextInt();
        for(i=0;i<=row;i++)
        {
            for(j=1;j<=row-i;j++)
            {
                System.out.print(" ");
            }
            for(j=1;j<=2*i-1;j++)
            {
                System.out.print("*");
            }
            System.out.print("\n");
        }

        for(i=row-1;i>=1;i--)
        {
            for(j=1;j<=row-i;j++) {

                System.out.print(" ");
            }
            for(j=1;j<=2*i-1;j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }

    }

}


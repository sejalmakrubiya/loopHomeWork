package forloophomework;

import java.util.Scanner;

public class RightangleTriangle3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //3.display right angle triangle of @ using nested for loops
        System.out.print("Enter any number to display like triangle with @ symbol = ");
        int i, j, n;


        n = scanner.nextInt();

        for (i = 1; i <= n; i++) {

            for (j = 1; j <= i; j++)
                System.out.print('@');

            System.out.println("");


        }

    }
}
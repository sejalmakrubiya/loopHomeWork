package forloophomework;

import java.util.Scanner;

public class MultiplicationTable10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
     /*10.write a program in java to display the multiplication table of
        a given integer */

        System.out.print("Enter any number which you want to print table : ");
        int number = scanner.nextInt();
        for (int i=0; i<=10; i++) {
            System.out.println(number  + " x " + i + " = " + number  *i);
        }

    }
}

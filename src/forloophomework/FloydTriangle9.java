package forloophomework;

import java.util.Scanner;

public class FloydTriangle9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    /*9. Wap to enter and print the number of rows floyd's triangle.
        for eg: number of rows in floyd's triangle*/

        System.out.print("Enter the number of rows for floyd's triangle:");
        //Copying user input into an integer variable named rows

        int number = 1, counter, j;
       int rows = scanner.nextInt();
        //To get the user's input

        System.out.println("Floyd's triangle");
        System.out.println("****************");
        for (counter = 1; counter <= rows; counter++) {
            for (j = 1; j <= counter; j++) {
                System.out.print(number + " ");
                //Incrementing the number value
                number++;
            }
            //for new line
            System.out.println();
        }

    }

}

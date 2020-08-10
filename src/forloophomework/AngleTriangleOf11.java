package forloophomework;

import java.util.Scanner;

public class AngleTriangleOf11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    //11. Display left angle triangle of * using nested for loops
        System.out.print("Enter input number of rows : ");
        int number=scanner.nextInt();


        //for numbers of rows
        for (int i =1; i<=number;i++) {//1<=5 condition true so go in inside
            //for space
        for (int j=number-1; j>=i; j--)
        {
            System.out.print(" ");
        }
       // for printing a loop
        for (int k=1; k<=i; k++ )
            {
                System.out.print("*");
            }
            System.out.println();//to go in next line



        }
    }
}

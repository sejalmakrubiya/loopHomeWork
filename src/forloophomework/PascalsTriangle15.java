package forloophomework;

import java.util.Scanner;

public class PascalsTriangle15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//15. write a java program to display pascal's triangle

        System.out.print("Input number of rows to display pascal's triangle = ");

        int no_row, c =1, blk, i,j;

        no_row =scanner.nextInt();
        for (i = 0; i < no_row; i++) {
            for (blk = 1; blk <= no_row - i; blk++)
                System.out.print(" ");
            for (j = 0; j <= i; j++) {
                if (j== 0 || i == 0) {
                    c = 1;
                } else{
                    c = c * (i - j + 1) / j;}
                System.out.print(" " + c);
            }
            System.out.print("\n");
        }


    }
}
package forloophomework;

import java.util.Scanner;

public class RhombusStructure13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    /*13.write a java program to display the number rhombus structure.
         Go to the editor*/

        System.out.print("Input the number to display rhombus structure =  ");
        int n = scanner.nextInt();
        int count = 1;
        int no_of_spaces = 1;
        int start = 0;

        for (int i = 1; i < (n * 2); i++) {

            for (int spc = n - no_of_spaces; spc > 0; spc--) {
                System.out.print(" ");
            }
            if (i < n) {
                start = i;            //for number
                no_of_spaces++;      //for spaces
            } else {
                start = n * 2 - i;   //for number
                no_of_spaces--;      //for space

            }
            //for lower part
            for (int j = 0; j < count; j++) {
                System.out.print(start);
                if (j < count / 2) {
                    start--;
                } else {

                    start++;
                }
            }
            if (i < n) {
                count = count + 2;
            } else {
                count = count - 2;
            }
            System.out.println();
        }


    }


}
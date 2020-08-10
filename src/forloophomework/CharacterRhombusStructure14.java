package forloophomework;

import java.util.Scanner;

public class CharacterRhombusStructure14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //14. Write a java program to display the following character rhombus structure.

        System.out.print("Input the  number of rows  to see rhombus structure =  ");

        int n = scanner.nextInt();
        int count = 1;
        int count2 = 1;
        char c = 'A';

        for (int i = 1; i < (n * 2); i++) {

            for (int spc = n - count2; spc > 0; spc--) {
                System.out.print(" ");
            }
            if (i < n) {
                count2++;


            } else {
                count2--;

            }
           // for lower part
            for (int j = 0; j < count; j++) {
                // print character
                System.out.print(c);
                if (j < count / 2) {
                    c++;
                } else {
                    c--;
                }
            }
            if (i < n) {
                count = count + 2;
            } else {
                count = count - 2;
            }
            c = 'A';

            System.out.println();
        }


    }


}



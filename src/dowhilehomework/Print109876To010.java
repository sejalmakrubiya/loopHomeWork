package dowhilehomework;

import java.util.Scanner;

public class Print109876To010 {
    public static void main(String[] args) {
        Scanner  scanner = new Scanner(System.in);

    //1. Wap to print  10,9,8,7,6,to 0
        System.out.print("Enter the number to decrease to 0: ");
        int number = scanner.nextInt();
        do{
            System.out.println(number);
            number--;

        } while (number>=0);
    }
}

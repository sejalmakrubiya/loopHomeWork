package forloophomework;

import java.util.Scanner;

public class ArmStrongNumber5 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
    //5.Wap to input any number and check if it is Armstrong number or not

      int num, number,temp, total = 0;
        System.out.print("Enter any Digit Number to check if it is Armstrong number or not = ");
        num = scanner.nextInt();

        number = num;

        for ( ;number!=0;number /= 10)
        {
            temp = number % 10;
            total= total + temp*temp*temp;
        }
        if (total == num)
            System.out.println(num + "is an Armstrong number");
        else
            System.out.println(num + "is not an Armstrong number");


    }
}

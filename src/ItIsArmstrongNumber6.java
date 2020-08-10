import java.util.Scanner;

public class ItIsArmstrongNumber6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    //6.Wap to input any number and check if it is ArmStrong number or not
        System.out.print("Enter any number to check if it is Armstrong number or not : ");
        int number = scanner.nextInt();
        // to check armstrong number eg.153(1*1*1)+(5*5*5)+(3*3*3*)=1+125+27=153
        int temp = number;
        int rem;
        int sum =0;
        while (number > 0) {
            //to find out reminder
            rem = number % 10;//153%10=3,15%10=5,1%10=1
            //change value of number variable
            number = number /10;//153/10=15,15/10=1,1/10=1
            sum = sum +rem * rem * rem;
        }
        if (temp == sum){
            System.out.print("It is an ArmStrong Number ");
        } else {
            System.out.print("It is not an ArmStrong Number");
        }
    }
}

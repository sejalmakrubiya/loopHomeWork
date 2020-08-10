import java.util.Scanner;

public class AnyFiveNumberAndFindSum2 {
    public static void main(String[] args) {
        //2.wap to input any five -digit number and then find sum of each digit
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter 5 digit number to find out sum of each digit:");
        int number = 0;
        int sum = 0;
        int rem = 0;
        number = scanner.nextInt();
        while (number > 0) {
            //to find out reminder
            rem=number%10;
            //add reminder into sum
            sum=sum+rem; //0+5=5,5+4=9,9+3=12,12+2=14,14+1=15,
            //change value of number variable
            number=number/10;//12345/10=1234,1234/10=123,123/10=12,12/10=1,
        }
        System.out.print("sum of digit is " +sum);

    }
}
import java.util.Scanner;

public class EnterFiveDigitNumberThenFindSumOfFirstAndLastDigit5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    //5.wap to input any five -digit number and then find sum of first and last digit

        System.out.print("Enter any five digit number to find sum of first and last digit : ");
        int number = scanner.nextInt();
        int lastDigit = number%10; // will return last digit of number
        int firstDigit=0;
        while (number!=0) {
            firstDigit=number%10;//will return first digit of number at the end of loop
                                //12345%10=5,1234%10=4,123%10=3,12%10=2,1%10=1
            number=number/10; //12345/10=1234,1234/10=123,123/10=12,12/10=1,1/10=0
        }
        int sum = firstDigit+lastDigit;
        System.out.println("Sum of First and Last digit is = " +sum);

    }
}

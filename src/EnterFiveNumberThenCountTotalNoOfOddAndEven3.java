import java.util.Scanner;

public class EnterFiveNumberThenCountTotalNoOfOddAndEven3 {
    public static void main(String[] args) {
        /*3.wap to input any five -digit number  then count total no of odd and even
        digit and find sum of them
         */
        Scanner scanner = new Scanner(System.in);
        int evenCount=0;
        int oddCount =0;
        System.out.print("Enter 5 digit number to find out sum of each digit:");
        int number =scanner.nextInt();
        while (number>0) {
            int rem=number%10;
            if(rem%2==0)
                evenCount++;
             else
                oddCount++;
                number=number/10;
        }
        System.out.println("Even Count ="+evenCount);
        System.out.println("Odd  Count ="+oddCount);
        System.out.println("Sum of even & Odd Number is ="+(evenCount+oddCount));
    }
}

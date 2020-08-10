import java.util.Scanner;

public class PrimeNumberOrNot8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    /*8. Wap to input any number and check if its prime number or not
    positive integer that is divisible only by itself and 1*/
        System.out.print("Enter any number to check if its prime number or not : ");
        int number = scanner.nextInt();
        int count = 0;//checking the factors of the number
        for (int i = 1; i <= number; i++)
        {
            if (number%i==0)
                 count++;
        }
        if (count==2) {
            System.out.println(number + " is a prime number");
        } else{
            System.out.println(number+" is not a prime number");}
    }
}

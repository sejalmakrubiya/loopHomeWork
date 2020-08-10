package forloophomework;

import java.util.Scanner;

public class PrimeNumber7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    //7. wap to input any number to check if  it  prime number or not
        //a number which is divaeded by itself and 1 is a prime number

        System.out.print("Enter any number to check if it is a prime number or not : ");

        int num = scanner.nextInt();

        int temp;
        boolean isPrime = true;
        for(int i=2; i<=num/2;i++)//2<=2.5
        {
            temp = num%i;//5%2=1
            if (temp==0){
                isPrime = false;
                break;
            }


        }
        //if is prime is true then the number is prime else not
        if(isPrime)
            System.out.println(num + " is a prime Number");
        else
            System.out.println(num + " is not a prime number");
    }
}

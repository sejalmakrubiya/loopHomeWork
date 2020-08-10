import java.util.Scanner;

public class FibonacciNumber9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    /*9.Wap to input any number (n) and find out fibonacci number in between 0 to given number
    fibonacci number is the sum of two preceding numbers from 0 and 1 eg 0+1=1.1+1=2*/

        int k;
        int a =0;
        int b=1;
        k= 0;
        System.out.print("Enter any number to check Fibonacci number: ");
        int number = scanner.nextInt();
        System.out.print("0 1 ");

        while (k<=number) {
            k=a+b;
            if(k>=number)
                break;
            System.out.print(k+"  ");
            a=b;
            b=k;

        }
    }
}

import java.util.Scanner;

public class PrintTonumber10To01 {
    public static void main(String[] args) {
        //Wap to print 10,9,8,7,6,to 0
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number to decrease to 0:");

        int a =scanner.nextInt();
        while (a >= 0) {
            System.out.println( a);
            a--;

        }
    }
}
package correctprogrammesweek2;

import java.util.Scanner;

public class Programme_15_SwapTheValue {

    public static void main(String[] args) {
        //Scanner declaration for reading input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first variable value");
        int first = scanner.nextInt();
        System.out.println("Enter the second variale value");
        int second = scanner.nextInt();
        Programme_15_SwapTheValue t = new Programme_15_SwapTheValue();
        t.swapTheValue(first,second);
        //closing the scanner object
        scanner.close();
    }

    //Swapping the value of variables
    public void swapTheValue(int a , int b){
        int c;
        System.out.println("Before the swapping, the values of first variable is: " +a +" and second variable is :"+b);
        c=a;
        a=b;
        b=c;
        System.out.println("After swapping, the values of first variable is : "+a + " and second variable is : " +b);
    }
}

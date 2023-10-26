package correctprogrammesweek2;

import java.util.Scanner;

public class Programme_9ConvertUpperToLowerCase {

    public static void main(String[] args) {
        //Scanner declaration for reading input from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the uppercase string :");
        String uppercase = scanner.nextLine();
        Programme_9ConvertUpperToLowerCase t = new Programme_9ConvertUpperToLowerCase();
        t.convertUpperToLowerCase(uppercase);
        scanner.close();
    }
    //Conversion to lower case method
    public void convertUpperToLowerCase(String text){
        System.out.println("The Lowercase value is = "+ text.toLowerCase());
    }

}
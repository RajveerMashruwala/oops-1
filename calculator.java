import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        // intializing the type of variable number 1
        double number1;
        //intializing the type of variable number 2
        double number2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number:");
        number1 = scanner.nextInt();
        System.out.println("Enter the second number:");
        number2 = scanner.nextInt();
        // to print the sum
        System.out.println("Sum:" + (number1 + number2));
       // to print the Difference 
        System.out.println("Difference:" + (number1 - number2));
        // to print the Product
        System.out.println("Product:" + (number1*number2));
        // to print the Quotent
        System.out.println("Quotent:" + (number1/number2));
        // to print the Remainder
        System.out.println("Remainder:" + (number1%number2));
    }   
}

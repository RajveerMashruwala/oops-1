import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        int number1;
        int number2;
        Scanner scanner = new Scanner(System.in);
        Scanner op = new Scanner(System.in);
        System.out.println("Enter the first number:");
        number1 = scanner.nextInt();
        System.out.println("Enter the second number:");
        number2 = scanner.nextInt();

        System.out.println("Sum:" + (number1 + number2));
        System.out.println("Difference:" + (number1 - number2));
        System.out.println("Product:" + (number1*number2));
        System.out.println("Quotent:" + (number1/number2));
        System.out.println("Remainder:" + (number1%number2));
    }   
}

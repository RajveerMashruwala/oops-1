import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number:");
        double number1 = scanner.nextDouble();
        System.out.println("Enter the second number:");
        double number2 = scanner.nextDouble();
        displaySum(number1, number2);
        displayDiffernce(number1, number2);
        displayQuotient(number1, number2);
        //displayRemainder(number1, number2);
    }
    public static void displaySum(double number1, double number2){
        double sum =  number1 +  number2;
        System.out.println("Sum:" + sum);
    }
    public static void displayDiffernce(double number1, double number2) {
        double differnce = number1 - number2;
        System.out.println("Difference" + differnce);
    }
    public static void displayProduct(double number1, double number2) {
        double product = number1*number2;
        System.out.println("Product" + product);
    }
    public static void displayQuotient(double number1, double number2){
        if (number2 == 0) {
            System.out.println("cannot divide by zero. enter number greater than zero");
        }
        else{
            double quotient = number1/number2;
            System.out.println("Quotient:" + quotient);
        }
    // public static void displayRemainder (double number1, double number2){
    //     if (number2 == 0) {
    //         System.out.println("cannot be divided by zero.enter number greater than zero");
    //     }
    //     else
    //     {
    //         double remainder = number1%number2;
    //         System.out.println("Remainder" + remainder);
    //     }
    //     }
    }
}

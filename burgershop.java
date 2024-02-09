import java.util.Scanner;

public class burgershop {
    private static final double BURGERPRICE = 5.99;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name:");
        String name = scanner.nextLine();
        System.out.println("Enter the number of burgers:");
        int burgers = scanner.nextInt();
        // calculating total prices of burgers
        double totalPrice = burgers*BURGERPRICE;
        //calculating total tax 
        double totalTax = totalPrice*0.07;
        //calculating total amount with taxes
        double totalAmount = totalPrice + totalTax;  
        //printing the customer name
        System.out.println("Customer Name:" + name);
        //printing the quantity of burgers
        System.out.println("Quantity of the burger:" + burgers);
        //printing the price of each burger
        System.out.println("Price for the burger" + BURGERPRICE);
        //printing the total price of all burgers
        System.out.println("Total price:" + totalPrice);
        //printing the total tax 
        System.out.println("Total Tax:" + totalTax);
        //printing the total amount
        System.out.println("Total Amount:" + totalAmount);
    }
}

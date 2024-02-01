import java.util.Scanner;

public class burgershop {
    private static final double BURGERPRICE = 5.99;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name:");
        String name = scanner.nextLine();
        System.out.println("Enter the number of burgers:");
        int burgers = scanner.nextInt();
        
        double totalPrice = burgers*BURGERPRICE;
        double totalTax = totalPrice*0.07;
        double totalAmount = totalPrice + totalTax;  

        System.out.println("Customer Name:" + name);
        System.out.println("Quantity of the burger:" + burgers);
        System.out.println("Price for the burger" + BURGERPRICE);
        System.out.println("Total price:" + totalPrice);
        System.out.println("Total Tax:" + totalTax);
        System.out.println("Total Amount:" + totalAmount);
    }
}

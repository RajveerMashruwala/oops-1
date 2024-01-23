// Name: Rajveer Mashruwala
// Assignment: lab 1
import java.util.Scanner;

public class lab1{

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = scanner.nextLine();

        System.out.println("Enter your age:");
        int age = scanner.nextInt();

        
        if (age <= 25) {
            System.out.println("Hey there " + " "+ name + " "+ " Welcome to Durham College class on OOPS. You are young and full of possibilites! ");
        } else if (age >25 && age < 45) {
            System.out.println("Hey there" + "" + name + "" + "Welcome to Durham College class on OOPS. you still have time to learn new things!");
        } else if (age > 45 && age <= 60 ) {
            System.out.println("Hey there"+" " + name +" "+ "Welcome to Durham College class on OOPS. It is never too late to start! ");
        }

        int retirementage = 65;
        int yearsremaingforretirement = retirementage - age;
        System.out.println("years remaining for the retirement are:"+yearsremaingforretirement);
    }
}
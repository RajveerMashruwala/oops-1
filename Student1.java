import java.util.Scanner;

import javax.lang.model.type.NullType;

public class Student1 {
    private String firstName;
    private String lastName;
    private int age;

    public Student1(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = 0;
    }

    public String getfirstName() {
        return firstName;
    }

    public void setfirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getlastName(){
        return lastName;
    }

    public void setlastName(String lastName){
        if (lastName == null || lastName.isEmpty()) {
            System.out.println("Last name required");
        }
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       System.out.println("Enter your first name:");
       String firstName = scanner.nextLine(); 
       System.out.println("Enter your last name:");
       String lastName = scanner.nextLine();
       
       System.out.println("Enter your age:");
       int age = scanner.nextInt();

       if (age < 0 || age > 100) {
           System.out.println("Please enter a valid age between 0 to 100");
        } 
        /*else if (lastName == "NULL") {
            System.out.println("Please enter your lastname");
        }*/
        else {
            System.out.println("My name is" + " " + firstName + " " + lastName + " " + "and my age is" + " " + age);
        }
        

    }
}


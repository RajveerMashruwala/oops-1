import java.util.Scanner;

// creating class for private name, age and gender
public class person {
    private String name;
    private int age;
    private char gender;
//  creating a constructer for getting a value and setting the value
    public person(String name, int age, char gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    public String getName() {
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
    public char getGender(){
        return gender;
    }
    public void setGender (char gender){
        this.gender = gender;
    }
    // creating a method to introduce the person
    public void introduce(){
        System.out.println("Name:"+ name);
        System.out.println("age:"+ age);
        System.out.println("Gender:"+ gender);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your Name");
        String name = scanner.nextLine();
        System.out.println("Enter your age:");
        int age = scanner.nextInt();
        System.out.println("Enter your gender (M/F):");
        char gender = scanner.next().charAt(0);
        person person = new person(name, age, gender);
        System.out.println("personal information");
        person.introduce();
    }
    
}

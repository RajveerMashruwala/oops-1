import java.util.Scanner;

public class burgershop {
    private String name;
    public int burgers;

public burgershop(String name, int burgers){
    this.name = name;
    this.burgers = burgers;
}

public String getName(){
    return name;
}
public void setName(String name){
    this.name = name;
}
public int getburgers(){
    return burgers;
}
public void setburgers( int burgers){
    this.burgers = burgers;
}
public void reciept(){

}

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name:");
        String name = scanner.nextLine();
        System.out.println("Enter the number of burgers:");
        int burgers = scanner.nextInt();
        System.out.println("The price per burger is 5.99");
        float price = scanner.nextFloat();

        double totalprice = burgers*price;
        double totaltax = totalprice*0.07;
        double totalamount = totalprice + totaltax;

    }
}

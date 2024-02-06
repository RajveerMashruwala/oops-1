import java.util.*;

public class inclassexercise {
    public static void main(String[] args) {
        int [] stepcount = new int [7];
        Scanner scanner = new Scanner(System.in);
        int totalsteps = 0;
        int average = 0; 
        for(int i = 0; i < stepcount.length; i++){
            System.out.println("Enter the steps:");
            stepcount[i] =  scanner.nextInt();
            totalsteps = totalsteps + stepcount[i];
        }
        System.out.println("Total Steps:"+totalsteps);
        average = totalsteps/7;
        System.out.println("Average Steps:"+average);
    }
}

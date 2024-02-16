// Name: Rajveer Mashruwala
// Student ID: 100911307
// Date: 2024/02/16 
public class stringexercise {
    public static void main(String[] args) {
        // Question 1
        String data = "java is awesome";
        char character = data.charAt(5);
        System.out.println("the character at index 5 in the string is:"+character);
        // Question 2
        System.out.println("The length of String is:"+data.length());
        // Question 3
        System.out.println("The substring starting from index 5 in the string is:"+data.substring(5));
        // Question 4
        System.out.println("The index of is:"+data.indexOf("is"));
        //Question 5
        System.out.println("The String in uppercase:"+data.toUpperCase());
        // Question 6
        System.out.println("The String in lowercase:"+data.toLowerCase());
        // question 7
        String newdata = data.replace("awesome", "amazing");
        System.out.println("The new String is:"+newdata);

    }
    
}

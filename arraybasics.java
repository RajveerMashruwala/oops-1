// import java.lang.reflect.Array;
import java.util.*;

public class arraybasics {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(); 
        list.add(20);
        list.add(30);
        list.add(25);
        list.add(35);
        list.add(-16);
        list.add(60);
        list.add(-100);
       System.out.println("Dafault list:" + list);

        list.add(80);
        list.remove(Integer.valueOf(-16));
       System.out.println("Updated List:" + list);
       
    }
    
}  
    //     int[] arry1 = new int[] {1, 2, 3, 4, 5};
    //     System.out.println(arry1);
    //     for(int i = arry1.length-1; i > 0; i--){
    //         arry1[i] = arry1[i]*arry1[i];
    //         System.out.println(arry1[i]);
    //         // System.out.println(sum(arry1)[i]);
    //     }
public class arraybasics {

    public static void main(String[] args) {
        int[] arry1 = new int[] {1, 2, 3, 4, 5};
        System.out.println(arry1);
        for(int i = arry1.length-1; i > 0; i--){
            arry1[i] = arry1[i]*arry1[i];
            System.out.println(arry1[i]);
            // System.out.println(sum(arry1)[i]);
        }
    }
}

package ArrayList;

import java.util.ArrayList;

public class Largest {
    public static int large(ArrayList <Integer> arr){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.size();i++){
            if(max<arr.get(i)){
            max=arr.get(i);
            }
        }
        return max;
    }
    public static void main(String[] args) {
        ArrayList <Integer> arr=new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(18);
        arr.add(15);
        System.out.println(large(arr));
    }
}

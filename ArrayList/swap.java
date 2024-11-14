package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class swap {
    public static void swapping(ArrayList<Integer> arr,int ind1,int ind2){
        int temp=arr.get(ind1);
        arr.set(ind1,arr.get(ind2));
        arr.set(ind2,temp);

    }
    public static void main(String[] args) {
        ArrayList <Integer> arr=new ArrayList<>();
        arr.add(100);
        arr.add(12);
        arr.add(13);
        arr.add(122);
        swapping(arr,1,2);
        System.out.println(arr);
        
    }
}

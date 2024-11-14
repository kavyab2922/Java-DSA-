package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class PairSum {
    public static boolean pairing(ArrayList<Integer> arr,int target){
        for(int i=0;i<arr.size();i++){
            for(int j=i+1;j<arr.size();j++){
                if(arr.get(i)+arr.get(j)==target){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList <Integer> arr=new ArrayList<>();
        arr.add(100);
        arr.add(12);
        arr.add(13);
        arr.add(122);
    System.out.println(pairing(arr,112));
        
    }
}

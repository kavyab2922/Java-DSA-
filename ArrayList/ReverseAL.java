package ArrayList;

import java.util.ArrayList;

public class ReverseAL {
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(1);
        arr.add(12);
        arr.add(13);
        arr.add(17);
        for(int i=arr.size()-1;i>=0;i--){
          System.out.print("["+arr.get(i)+"]");
        }
    }
    
}

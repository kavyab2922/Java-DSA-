package ArrayList;
import java.util.*;

public class sort {
    public static void main(String[] args) {
        ArrayList <Integer> arr=new ArrayList<>();
        arr.add(100);
        arr.add(12);
        arr.add(13);
        arr.add(122);
        
        System.out.println(arr);
        Collections.sort(arr);  //ascending order
        System.out.println(arr);

        Collections.sort(arr,Collections.reverseOrder());
        System.out.println(arr);


        


    }
    
}

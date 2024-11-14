package Array;

public class LargestInArray {
    public static int large(int arr[]){
    int large=Integer.MIN_VALUE;
    for(int i=0;i<arr.length;i++){
        if(arr[i]>large){
            large=arr[i];
        }
    }
    return large;
    }
    public static void main (String[]args){
        int arr[]={1,2,3,3,5,6,7,8,9};
        int large =large(arr);
        System.out.println(large);
        
    }
}

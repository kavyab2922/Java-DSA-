package Array;

public class LSnew {
    public static void linear(int[]arr,int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                System.out.println(i);
            }
        }
    }
    public static void main (String[]args){
        int arr[]={2,4,6,8,10,12,14};
        int key=10;
        linear(arr,key);
    }
    
}

package Array;

public class LinearSearch {
    public static void main(String[]args){
        int arr[]={2,4,6,8,10,12,14,16,18};
        int key=10;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                System.out.println(i);
            }
        }
    }
}

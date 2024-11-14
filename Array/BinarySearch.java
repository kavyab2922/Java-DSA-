package Array;

public class BinarySearch {
    public static int Binary(int arr[],int key ){
        int start=0;
        int end=arr.length-1;
      while(start<=end){
        int mid=(start+end)/2;
        if (arr[mid]==key){
           return mid; 
        }
        if(arr[mid]<key){
            start=mid+1;
        }else{
            end=mid-1;
        }
      }
      return -1;
      
    }
    public static void main(String[] args) {
        int arr[]={56,89,45,95};
        int key=56;
        System.out.println(Binary(arr,key));
    }
}

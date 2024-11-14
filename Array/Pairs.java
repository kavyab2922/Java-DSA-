package Array;

public class Pairs {
    public static void pairing(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                System.out.print("("+arr[i]+","+arr[j]+")"+",");
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={2,4,6,8,9,10,12,14,16,18,20};
        pairing(arr);
    }
}

package Array;

public class PrefixArray {
    public static int pre(int arr[]){

        int curSum=0;
        int maxSum=Integer.MIN_VALUE;
        int prefix[]=new int[arr.length];

        prefix[0]=arr[0];
        for(int i=1;i<prefix.length;i++){
            prefix[i]=prefix[i-1]+arr[i];
        }
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                curSum = i==0? prefix[j] :prefix[j]-prefix[i-1];
            }
            if(curSum>maxSum){
                maxSum=curSum;
            }
        }
    return maxSum;
    }
    public static void main(String[] args) {
        int arr[]={2,4,6,8,10};
        int abc=pre(arr);
        System.out.println(abc);
    }
}

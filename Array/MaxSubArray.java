package Array;

public class MaxSubArray {
    public static int max(int arr[]){
        int currSum=0;
        int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                currSum=0;
                for(int k=i;k<j;k++){
                    currSum+=arr[k];
                }
                if(currSum>maxSum){
                    maxSum=currSum;
                }

            }
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int arr[]={2,3,5,8,9};
        int maxsum=max(arr);
        System.out.println(maxsum);
    }
}

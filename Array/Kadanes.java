package Array;

public class Kadanes {
    // public static void kadaneProblem(int arr[]){
    //     int ms=Integer.MIN_VALUE;
    //     int cs=0;

    //     for(int i=0;i<arr.length;i++){
    //         cs+=arr[i];
    //         if(cs<0){
    //             cs=0;
    //         }
    //         ms=Math.max(ms,cs);
    //     }
    //     System.out.println(ms);
    // }

    public static void kadaneProblem(int arr[]){
        int ms=Integer.MIN_VALUE;
        int cs=0;

        for(int i=0;i<arr.length;i++){
            cs=cs+arr[i];
            if(cs<0){
                cs=0;
            }
            ms=Math.max(cs,ms);
        }
        System.out.println(ms);
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,4,-9,-4};
        kadaneProblem(arr);
    }
}

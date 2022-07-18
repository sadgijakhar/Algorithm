public class MaxSumArray {
    // static int maxSum(int arr[] , int low , int high){
    //     if(low == high){
    //         return arr[high];
    //     }
    //     int mid  = low +(high-low)/2;
    //     int sum = 0;
    //     int leftMax = Integer.MIN_VALUE;
    //     for (int i = 0; i <= mid; i++) {
    //         sum+= arr[i];
    //         if(leftMax <sum){
    //             leftMax = sum ;
    //         }

    //     }
    //     sum = 0;
    //     int rightMax = Integer.MIN_VALUE;
    //     for (int i = mid+1; i <= high; i++) {
    //         sum+= arr[i];
    //         if(rightMax <sum){
    //             rightMax = sum ;
    //         }
    //     }
    //     int maxLeftRight = Math.max(maxSum(arr ,low , mid), maxSum(arr,mid+1 , high));
    //     return Math.max(maxLeftRight , leftMax + rightMax);
    // }
    static int maxSum(int arr[]){
        int n = arr.length;
        int max_Till_Now = Integer.MIN_VALUE;
        int end = 0;
        for(int i = 0 ; i < n ; i ++){
            end += arr[i];
            if(max_Till_Now < end){
                max_Till_Now = end;
            }
            if(end < 0){
                end = 0;
            }
        }
        return max_Till_Now;
    }
    public static void main(String[] args) {
        int[] arr = {2,-4,1,9,-6,7,-3};
        // int low = 0;
        // int high = arr.length-1;
        System.out.println(maxSum(arr));
    }
}

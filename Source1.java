import java.util.Arrays;

public class Source1{
    static void bubble(int[] n){
        int size = n.length;
        boolean sort = true ;
        for(int  j = 0 ; j < size ; j++){
            for(int  i = 0 ; i < size-1 ; i++){
                if(n[i] > n[i+1]){
                    int temp = n[i];
                    n[i] = n[i+1];
                    n[i+1] = temp;
                    sort = false;
                }
            }
            if(sort){
                break;
            }
        }
        System.out.println(Arrays.toString(n));
    }
    static void selection ( int[] arr){
        int min;
        
        int size = arr.length;
        for(int  j = 0 ; j < size ; j++){
            min = arr[j];
            int pos = j;
            for(int  i = j ; i < size ; i++){
                if(min > arr[i]){
                    min = arr[i];
                    pos = i;
                }
            }
            if(pos != j){
                int temp = arr[j];
                arr[j] = min;
                arr[pos] = temp;
            }
            
        }
        System.out.println(Arrays.toString(arr));
    }
    static void insert(int arr[]){
        for(int i = 0 ; i < arr.length-1 ; i++){
            if(arr[i] > arr[i+1]){
                arr[i] = arr[i] + arr[i+1];
                arr[i+1] = arr[i] - arr[i+1];
                arr[i] = arr[i] - arr[i+1];
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    static void linear(int[] arr , int n){
        boolean found = false;
        for (int i =0 ; i< arr.length ; i++){
            if(arr[i] == n){
                System.out.println("Element fount at pos :"+(i+1));
                found = true;
                break;
            }
        }
        if(!found){
            System.out.println("Not Found");
        }
        
    }
    static int binary(int arr[],int low, int high , int n){
        if(low < high){
            int mid = low +(high - low)/2;
            if(n == arr[mid]){
                return 1;
            }
            else if (arr[mid] > n){
                return binary(arr,low, mid -1, n);
            }
            else{
                return binary(arr,mid+1, high, n);
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr []= {4,2,6,1,7,9,3,8};
        bubble(arr);
        selection(arr);
        insert(arr);
        int low = arr[0];
        int high = arr[arr.length -1];
        linear(arr, 5);
        if(binary(arr,low, high, 5) == 1){
            System.out.println("found");
        }
        else{
            System.out.println("Not found");
        }
    }
}
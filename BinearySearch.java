import java.util.Scanner;
public class BinearySearch {
    public static int search(int arr[] , int key){
        int start = 0;
        int end = arr.length -1;
        while(start <= end){
            // int mid = (start + end)/2;
            int mid = start +(end - start)/2;
            if(key == arr[mid]){
                return key;
            }
            else if(key < arr[mid]){
                end = mid - 1 ;

            }
            else{
                start = mid + 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of Element in the Array: ");
        int n = sc.nextInt();
        System.out.println("Enter Elements of Array in Sorted Manner: ");
        int A[] = new int[n];
        for(int i = 0 ; i < n ; i++){
            A[i] = sc.nextInt();
        }
        System.out.print("Enter the Element to Search: ");
        int K = sc.nextInt();
        if(search(A, K) == -1){
            System.out.println("Element Not Found");
        }
        else{
            System.out.println("Element Found"+search(A, K));
        }
        sc.close();

    }
    
}

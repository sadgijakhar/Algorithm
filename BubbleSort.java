import java.util.Scanner;
//Time Complexity of Order O(n^2)
public class BubbleSort {
    public static void sort(int arr[]){
        for(int i = arr.length-1 ; i > 0 ; i--){
            for(int j = 0 ; j < i ; j++){
                if(arr[j] > arr[j+1]){
                    arr[j] += arr[j+1];
                    arr[j+1] = arr[j] - arr[j+1];
                    arr[j] = arr[j] - arr[j+1];
                }
            }
        }
    }
    // To Optimism The time Complexity
    public static void sortopt(int arr[]){
        boolean sorted ;
        int count = 0 ;
        for(int i = arr.length-1 ; i > 0 ; i--){
            sorted = true;
            System.out.println("pass "+ count);
            for(int j = 0 ; j < i ; j++){
                
                if(arr[j] > arr[j+1]){
                    System.out.println("Performming Swap");
                    arr[j] += arr[j+1];
                    arr[j+1] = arr[j] - arr[j+1];
                    arr[j] = arr[j] - arr[j+1];
                    sorted = false;
                }
            }
            count++;
            if(sorted){
                System.out.println("Stopping");
                break;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of Element in the Array: ");
        int n = sc.nextInt();
        System.out.println("Enter Elements of Array: ");
        int A[] = new int[n];
        for(int i = 0 ; i < n ; i++){
            A[i] = sc.nextInt();
        }
       sortopt(A);
       System.out.println("Sorted Array : ");
       for(int i = 0 ; i < A.length  ; i++ ){
        
        System.out.print(A[i] + " ");
       }
        sc.close();

    }
    
}

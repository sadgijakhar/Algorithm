import java.util.Scanner;
public class BSearch {
    public static boolean search(int[] arr , int key , int Start , int end){
        if(Start <= end){
            int mid = Start +(end-Start)/2;
            if(arr[mid] == key){
                return true;
            }
            else if(arr[mid] > key){
                return search(arr,key,0 ,mid-1);
            }
            else{
                return search(arr , key , mid+1 , end);
            }
        }
        return false;
    
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
        int Start = 0;
        int end = A.length -1;
        if(search(A, K , Start , end) == false){
            System.out.println("Element Not Found");
        }
        else{
            System.out.println("Element Found: "+search(A, K,Start , end));
        }
        sc.close();

    }
    
}

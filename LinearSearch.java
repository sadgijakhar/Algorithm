import java.util.Scanner;
public class LinearSearch {
    public static boolean search(int arr[] , int key){
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] == key){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. of element in array: ");
        int n = sc.nextInt();
        int A[] = new int[n];
        System.out.println("Enter the element you want in your array :");
        for(int i = 0 ; i < n ; i++){
            A[i] = sc.nextInt();
        }
        System.out.print("Enter the number to be Searched: ");
        int b = sc.nextInt();
        
        if(LinearSearch.search(A, b) == false){
            System.out.println("Element not found");
        }
        else{
            System.out.println("Element found");
        }
        sc.close();
    }
}

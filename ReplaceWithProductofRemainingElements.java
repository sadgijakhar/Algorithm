/*Replace With Product of Remaining Elements
Description
You are given an array of integers. You need to replace each element with the product of the remaining elements.
You are not allowed to use division operators.
For example: Consider the array {1, 2, 3, 4, 5}

Product of the other elements except 1 = 2 * 3 * 4 * 5 = 120
Product of the other elements except 2 = 1 * 3 * 4 * 5 = 60
Product of the other elements except 3 = 1 * 2 * 4 * 5 = 40
Product of the other elements except 4 = 1 * 2 * 3 * 5 = 30
Product of the other elements except 5 = 1 * 2 * 3 * 4 = 24
Hence, the output would be {120, 60, 40, 30, 24}.

Input Format:
The input contains the number of integers in the array, followed by the integers in the array.

Output Format:
The output contains an array of integers where each element has been replaced with the product of the remaining elements.

Sample Test Cases:
Input:
5 1 2 3 4 5
Output:
120 60 40 30 24

Input:
4 8 3 5 2
Output:
30 80 48 120  */
import java.util.Scanner;
public class ReplaceWithProductofRemainingElements {
    //Approach 1
    /* 
    static void RPRE(int arr[], int n) 
    {
        int product = 1;
        int [] arr1 = new int[n];
        for (int j = 1; j < arr1.length; j++) {
            product *= arr[j];
        }
        for(int i = 0 ; i < n ; i++){
            arr1[i] = product/arr[i];
        }
        for(int i = 0 ; i < n ; i++){
            System.out.print(arr1[i] + " ");
        }
    }
    */
    // Approach 2
   
    static void RPRE(int arr[], int n) 
    {
        int left[] = new int [n];
        int right [] = new int[n];

        for(int i = 1 ; i < n;i++ ){
            left[0] = 1;
            left[i] = left[i-1] * arr[i-1];
        }
        for(int i = n-2 ; i >= 0;i-- ){
            right[n-1] = 1;
            right[i] = right[i+1] * arr[i+1];
        }
        for(int i = 0 ; i < n ; i++){
            arr[i] = left[i]*right[i];
        }
        for(int i = 0 ; i < n ; i++){
            System.out.print(arr[i] + " ");
        }
    }
    //Approch 3
    // static void RPRE(int arr[], int n) 
    // {

    // }
  
    public static void main(String[] args) 
    { 
        int n;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++)
            arr[i] = s.nextInt();
        RPRE(arr, n);
        s.close();
    } 
}

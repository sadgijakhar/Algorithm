/*Duplicate in an Array
Description
You are given an array of 'n' integers. The integers in the array are between 1 and n-1. You have to find the duplicate.

You need to do it in O(n) time, but you can use extra space.



Input Format:

The input contains the number of elements in the array, followed by the elements in the array.



Output Format:

The output returns the duplicate integer or returns -1 if there is no duplicate.





Sample Test Cases:

Input:

5 1 4 3 2 3



Output:

3



Input:

4 1 3 2 1



Output:

1

 */
import java.util.Scanner;
 
public class DuplicatesInArray
{
    static int duplicate(int arr[], int n)
    {
        for(int i = 0 ; i  < arr.length ; i++){
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]== arr[j]){
                    return arr[j];
                }
            }
            
        }
        return -1;
        //Write code here
    }
    
    public static void main(String args[])
    {
        int n;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++)
            arr[i] = s.nextInt();
 
        System.out.println(duplicate(arr, n));
        s.close();
    }
}
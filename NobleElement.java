/*Noble Integer
Description
You are given an integer array. Determine if an integer x exists such that the number of integers greater than x in the array is equal to x.



Let's consider the array [4, 5, 8, 3]. You can see that 4, 5 and 8 are greater than 3. So, the number of integers greater than 3 in the array is 3. Hence, you return 1.



Input Format:

The input contains the number of elements in the array, followed by the elements in the array.



Output Format:

The output returns 1 if such an integer x exists or returns -1 if such an integer x does not exist.





Sample Test Cases:

Input:

4 4 5 8 3



Output:

1





Input:

4 4 2 8 3



Output:

-1 */

import java.util.*;
 
public class NobleElement
{
    static int nobleNum(int arr[], int n)
    {
        Arrays.sort(arr);

        for (int i = 0; i < n; i++)
        {
            if (i < n-1 && arr[i] == arr[i+1])
                continue;
    
            if (n-i-1 == arr[i])
                return 1;
        }
        return -1;
    }
    
    public static void main(String args[])
    {
        int n;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++)
            arr[i] = s.nextInt();
 
        System.out.println(nobleNum(arr, n) + "\n" );
        s.close();
    }
}

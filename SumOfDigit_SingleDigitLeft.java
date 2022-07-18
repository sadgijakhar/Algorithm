/*Sum of Digits (Single Digit Left)
Description
You are given a number n. You need to keep finding the sum of its digits until the sum becomes a single digit.

For example, let's say n = 4651.

Sum of digits = 4+ 6 + 5 + 1 = 16 (double-digit sum)

Sum of digits now = 1 + 6 = 7 (single-digit sum)

Input Format:

The input contains the number, n.

Output Format:

The output contains the single digit sum.

Sample Test Cases:

Input:
4651
Output:
7

Input:
23
Output:
5 
*/
import java.util.Scanner;
public class SumOfDigit_SingleDigitLeft {
    static int sumOfDigitsSingle(int num)
    {
        int sum = 0;  
        while (num > 0 || sum > 9)  
        {  
            if (num == 0)   
            {  
                num = sum;  
                sum = 0;  
            }  
            sum = sum + num % 10;  
            num = num / 10;  
        }  
        return sum;  
        //Write code here
    }
    
    public static void main(String args[])
    {
        int n;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        
        System.out.println(sumOfDigitsSingle(n) + "\n" );
        s.close();
    }
}

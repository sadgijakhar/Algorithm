import java.util.Scanner;

/*Generate All Passwords
Description
You are given a set of characters. You need to generate all possible passwords from them. For this, you need to find all possible permutations of the given characters.
Input Format:
The input contains the number of characters, followed by the characters.
Output Format:
The output contains all the possible passwords.
Sample Test Cases:
Input:
2 x y
Output:
x
y
xx
xy
yx
yy
 */

 public class AllPassword 
{ 
    static void fun(char[] arr, int i ,String s , int len){
        
        if(i == 0){
            System.out.println(s);
            return ;
        }
        for (int j = 0; j < len; j++)
        {
            String appended = s + arr[j];
            fun(arr, i- 1, appended, len);
        }
        return;
    }
    static void genPW(char[] arr, int n) 
    { 
        for (int i = 1; i <= n; i++)
        {
            fun(arr, i, "", n);
        }

        
    } 
  
    public static void main(String[] args) 
    { 
        int n;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        char arr[] = new char[n];
        for(int i = 0; i < n; i++)
            arr[i] = s.next().charAt(0);
        genPW(arr, n);
        s.close();
    }
}
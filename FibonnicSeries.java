import java.util.Scanner;
public class FibonnicSeries {
    // Method 1 : Time Complexity of O(2^n) ; Space Complexity of O(1)
    public int fib(int n){
        if(n < 2){
            return n;
        }
        else{
            return fib(n-1)+fib(n-2)%10;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to find the sum of fibonnic series : ");
        int a = sc.nextInt();
        FibonnicSeries f = new FibonnicSeries();
        
        System.out.println(f.fib(a));
        sc.close();
    }
}

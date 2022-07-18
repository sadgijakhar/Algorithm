import java.util.Scanner;
public class FibonnicSeries2 {
    //Method 2 
    public void fibSeries(int n){
        int n1 = 0;
        int n2 = 1;
        int n3 = n;
        System.out.print("The fabonnic Series is: " + n1+" " +n2+" ");
        for(int i = 1 ; i < n ;++i){
            n3 = (n1 + n2)%10;
            n1 = n2;
            n2 = n3;
            System.out.print(n3+" ");
        }
        System.out.println();
        System.out.println("Faboonic number: " +n3);
        System.out.println();
        
    }
    // Method 3 Time complexity of O(n) ; Space Complexity of O(k);
    public void fibNumber(int n){
        int [] ar = new int[n+1];
        ar[0] = 0;
        ar[1] = 1;
        for(int i = 2 ; i <= n ; i++){
            ar[i] = (ar[1]+ ar[0])%10;
            ar[0] = ar[1];
            ar[1] = ar[i];
        }
        System.out.println("The fabonnic number is: " +ar[n]);
    }
    public static void main(String[] args) {
        FibonnicSeries2 f = new FibonnicSeries2();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to find fibonnic Series: ");
        int a = sc.nextInt();
        f.fibSeries(a);
        f.fibNumber(a);
        sc.close();
    }
}

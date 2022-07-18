import java.util.Scanner;
public class Factorial {
    public int fact(int n){
        if(n <= 1){
            return 1;
        }
        else{
            return n*fact(n-1);
        }
    }
    public static void main(String[] args) {
        Factorial f = new Factorial();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. to find factorial: ");
        int a = sc.nextInt();
        System.out.println(f.fact(a));
        sc.close();
    }
}

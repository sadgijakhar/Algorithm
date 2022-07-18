import java.util.Scanner;
public class PrimeNumber {
    public static int prime(int n , int divident){
        if(n % divident == 0){
            return 0;
        }
        else if(divident <= 2){
            return 1;
        }
        else {
            return prime(n , divident -1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check: ");
        int a = sc.nextInt();
        int b = a/2;
        if(PrimeNumber.prime(a ,b)==0){
            System.out.println("It is not Prime Number");
        }
        else{
            System.out.println("It is a Prime Number");
        }
        sc.close();
        
    }
}

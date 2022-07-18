import java.util.Scanner;
import java.lang.Math;
public class SumOfGP {
    static long gp(long a, long r, long n, long m)  
    { 
        long gp = (long)Math.pow(r,n) -1 ;
        long deno = r-1;
        long t = gp/deno;
        long s = a*t;
        return s%m;//Write code here  
    } 
    
    public static void main(String args[])
    {
        int a, r, n, m;
        Scanner s = new Scanner(System.in);
        a = s.nextInt();
        r = s.nextInt();
        n = s.nextInt();
        m = s.nextInt();
        
        System.out.println(gp(a, r, n, m) + "\n" );
        s.close();
    }
}


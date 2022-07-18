import java.util.Scanner;

public class GCD {
    static int gcd(int x, int y)
    {
        int gcd = Math.min(x,y);
        while(gcd > 0){
            if(x% gcd == 0 && y%gcd==0){
                break;
            }
            gcd--;
        }
        
        return gcd;
    }
    
    public static void main(String args[])
    {
        int x, y;
        Scanner s = new Scanner(System.in);
        x = s.nextInt();
        y = s.nextInt();
        
        System.out.println(gcd(x, y) + "\n" );
        s.close();
    }
}

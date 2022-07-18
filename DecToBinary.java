import java.util.Scanner;

public class DecToBinary {
    static int decToBin(int n)
    {
        int binary = 0 ;
        if(n>=0){
            if(n==0){
                return 0;
            }
            else{
                return n%2 + 10*(decToBin(n/2));
            }
        }
        
        return binary;
        
        
    }
    
    public static void main(String args[])
    {
        int n;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        
        System.out.println(decToBin(n) + "\n" );
        s.close();
    }
}

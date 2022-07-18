import java.util.Scanner;
public class PrimeNumber1 {
// To check the prime number in a given range
static boolean isPrime (int n)
{
  if (n < 2)
    return false;

  for (int i = 2; i < n; i++)
    {
    if (n % i == 0)
      return false;
    }
  return true;
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Start Number: ");
        int m = sc.nextInt();
        if(m < 1){
            m=2;
        }
        System.out.print("Enter the end Number: ");
        int n = sc.nextInt();
        for (int i = m; i <= n; i++)
        if (isPrime (i))
        System.out.println (i);
        sc.close();
    }
}

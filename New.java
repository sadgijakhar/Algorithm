import java.util.Scanner;
public class New {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
       
        sc.close();
        for(int i = a ; i > 0 ;i--){
            for (int j = i; j <= a ; j++) {
                int b = 'A' + j -1;
                char c = (char) b;
                System.out.print(c);
            }
            System.out.println();
        }
        // Write your code here
        
    }
      
}

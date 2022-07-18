import java.util.Scanner;
public class LCS {
    static int same(String r , String s){
        int n = r.length();
        int b = s.length();
        int a [][] = new int [n+1][b+1];
        char arr[] = new char[n+1];
        for(int i = 1 ; i < arr.length ; i++){
            char c = r.charAt(i-1);
            arr[i] = c;
        } 
        char arr1[] = new char[b+1];
        for(int i = 1 ; i < arr1.length ; i++){
            char c = s.charAt(i-1);
            arr1[i] = c;
        }
        for(int i = 0 ; i < a.length ; i++){
            a[i][0] = 0;
        }
        for(int i = 0 ; i < a[0].length; i++){
            a[0][i] = 0;
        }
        for(int i = 1 ; i < a.length ; i++){
            for (int j = 1; j < a[0].length; j++) {
                if(arr[i] == arr1[j]){
                    a[i][j] = 1 + a[i-1][j-1];
                }
                else{
                    a[i][j] = Math.max(a[i-1][j], a[i][j-1]);
                }
            }
        }
        return a[n][b];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String r = sc.nextLine();
        r.toLowerCase();
        String s = sc.nextLine();
        s.toLowerCase();
        // if(s.length() == r.length()){
            System.out.println(same(r, s));
        // }
        // else{
        //     System.out.println("Length should be same");
        // }
        sc.close();

    }
}

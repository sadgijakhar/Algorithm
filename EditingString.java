import java.util.Scanner;

public class EditingString{
    static int LCS(String r , String s){
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
            a[i][0] = i;
        }
        for(int i = 0 ; i < a[0].length; i++){
            a[0][i] = i;
        }
        for(int i = 1 ; i < a.length ; i++){
            for (int j = 1; j < a[0].length; j++) {
                if(arr[i] == arr1[j]){
                    a[i][j] = a[i-1][j-1];
                }
                else{
                    a[i][j] = 1+Math.min(a[i-1][j], Math.min(a[i][j-1], a[i-1][j-1]));
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
        System.out.println(LCS(r, s));
        sc.close();

    }
}
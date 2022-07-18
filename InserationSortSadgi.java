
import java.util.Arrays;
import java.util.Scanner;
 
 class InserationSortSadgi {
    public static void sort(int arr[]){
       for(int i = 1 ; i< arr.length ; i ++){
        int key  = arr[i];
        int j = i - 1;
        while(arr[j] > arr[i] && (j>=0)){
            arr[i] = arr[j];
            arr[j] = key;
            if(j>0){
                j--;
                i--;
            }
            
        }
       }
       System.out.println(Arrays.toString(arr));

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int [n];
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        sort(arr);
        // for(int i =0 ; i < n ; i++){
        //     System.out.println(arr[i]);
        // }
        sc.close();
    }
 //Write your code here

}


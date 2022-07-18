import java.util.Scanner;
public class QuickSortSadgi {
    static void quickSort(int arr [] , int low , int high){
        if(low < high){
            int pivot = partition(arr , low , high);
            quickSort(arr, low, pivot -1);
            quickSort(arr, pivot +1, high);
        }
    }
    static int partition(int arr[] ,int low , int high){
        int pivotElement = arr[high];
        int p = low;
        for(int i = low ; i < high ; i++){
            if(arr[i] <= pivotElement){
                int temp = arr[i];
                arr[i] = arr[p];
                arr[p] = temp;
                p++;
            }
        }
        int temp2 = arr[p];
        arr[p] = arr[high];
        arr[high] = temp2;
        return p;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        int low = 0 ;
        int high = n-1;
        quickSort(arr, low, high);
        for(int i = 0 ; i <arr.length ; i++){
            System.out.println(arr[i]);
        }
        sc.close();
    }
}
public class SelectionSort {
    public static void sort(int arr[]){
        for(int i = 0; i < arr.length ; i++){
            int min = arr[i];
            int pos = i;
            for (int j = i ; j <arr.length; j++){
                if(min > arr[j]){
                    pos = j;
                    min = arr[j];
                }
            }
            if(pos != i){
                arr[pos] = arr[i];
                arr[i] = min;
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {4,2,1,3,6,5};
        sort(arr);
        for(int i = 0 ; i <arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
    }
    
}

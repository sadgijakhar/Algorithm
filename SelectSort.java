import java.util.Arrays;

public class SelectSort {
    static void selectionSort(int[] A){
        for(int i = 0 ; i <A.length ; i++){
            int min = A[i];
            int pos = i;
            for(int j = i ; j < A.length ; j++){
                if(A[j] < min){
                    min = A[j];
                    pos = j;
                }
                
            }
            if(pos != i){
                A[pos] = A[i];
                A[i] = min; 
            }
        }
        System.out.println(Arrays.toString(A));
    }
    public static void main(String[] args) {
        int A[] = {5,1,2,3,4,7};
        selectionSort(A);

    }
}

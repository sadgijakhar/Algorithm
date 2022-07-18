public class test1 {
    static int minway(int[] steps , int stairs){
        int arr[][] = new int[steps.length+1][stairs+1];
        for(int i = 0 ; i < arr.length ; i++){
            arr[i][0] = 1;
        }
        for(int i =1 ; i <arr.length ; i++){
            arr[0][i] = 0;
        }
        for(int i = 1; i < arr.length ; i++){
            for(int j = 1 ; j < stairs+1 ; j++){
                if( steps[i-1] > j){
                    arr[i][j] = arr[i-1][j];
                }
                else{
                    arr[i][j] = arr[i-1][j]+arr[i][j-steps[i-1]];
                }
            }
        }
        return arr[steps.length][stairs];
    }
    public static void main(String[] args) {
        int steps[] = {1,2,3};
        int stairs = 10;
        System.out.print("Total no. of ways: ");
        System.out.println(minway(steps , stairs));
    }
}

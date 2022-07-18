public class MinWayCoin {
    static int minway(int[] coins , int amount){
        int arr[][] = new int[coins.length+1][amount+1];
        for(int i = 0 ; i < arr.length ; i++){
            arr[i][0] = 1;
        }
        for(int i =1 ; i <amount+1 ; i++){
            arr[0][i] = 0;
        }
        for(int i = 1; i < arr.length ; i++){
            for(int j = 1 ; j < amount+1 ; j++){
                if( coins[i-1] > j){
                    arr[i][j] = arr[i-1][j];
                }
                else{
                    arr[i][j] = arr[i-1][j]+arr[i][j-coins[i-1]];
                }
            }
        }
        return arr[coins.length][amount];
    }
    public static void main(String[] args) {
        int coins[] = {1,2,5,8,10,14};
        int amount = 1132;
        System.out.println(minway(coins , amount));
    }
}

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class KnapSackProblem {
    class Item{
        int id;
        int weight;
        int profit;
        Item(int id , int weight , int profit ){
            this.id = id ;
            this.weight = weight;
            this.profit = profit;
        }
    }
    static int min(ArrayList<Item> item , int capacity){
        Comparator<Item> com = (o1,o2)->{
            return o1.weight>o2.weight?1:-1;
        };
        int n =item.size();
        Collections.sort(item,com);
        int arr[][] = new int[n+1][capacity+1];
        
        for(int i = 0 ; i < arr.length ; i++){
            arr[i][0] = 0;
        }
        for(int i = 1 ; i < arr.length; i++){
            arr[0][i] = 0;
        }
        for(int i = 1 ; i < arr.length ; i++){
            for(int j = 1 ; j < arr[0].length ; j++){
                int w = item.get(i-1).weight;
                if(w > j){
                    arr[i][j] = arr[i-1][j];
                }
                else{
                    arr[i][j] = Math.max(arr[i-1][j],item.get(i-1).profit + arr[i-1][j-w]);
                }
            }
        }
        return arr[n][capacity];
    }
    public static void main(String[] args) {
        KnapSackProblem f = new KnapSackProblem();
        ArrayList<Item> items = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of Items: ");
        int n = sc.nextInt();
        for(int i = 0 ; i < n ; i ++){
            System.out.println("Enter the Weight of Item :"+(i+1));
            int weight = sc.nextInt();
            System.out.println("Enter the Profit of Item :"+(i+1));
            int profit = sc.nextInt();
            items.add(f.new Item((i+1) , weight , profit));
        }
        System.out.println(min(items, 50));
        sc.close();
    } 
}

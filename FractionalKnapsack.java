import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
public class FractionalKnapsack {
    class Item{
        int id;
        int weight;
        double profit;
        double effectiveProfit;
        Item(int id , int weight , double profit ){
            this.id = id ;
            this.weight = weight;
            this.profit = profit;
            this.effectiveProfit = profit/weight;
        }
    }
    static double maxProfit(ArrayList<Item> items , int capacity){
        double max = 0.0;
        int remainingCapacity  = capacity;
        Comparator<Item> custom = (o1, o2) -> {
            return o1.effectiveProfit<o2.effectiveProfit?1:-1;
        };
        Collections.sort(items , custom);
        for(Item item : items){
            if(item.weight <= remainingCapacity){
                max += item.profit;
                remainingCapacity -= item.weight;
            }
            else{
                max += remainingCapacity *item.effectiveProfit; 
                remainingCapacity = 0;
            }
            if(remainingCapacity == 0){
                break;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        FractionalKnapsack f = new FractionalKnapsack();
        ArrayList<Item> items = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of Items: ");
        int n = sc.nextInt();
        for(int i = 0 ; i < n ; i ++){
            System.out.println("Enter the Weight of Item :"+(i+1));
            int weight = sc.nextInt();
            System.out.println("Enter the Profit of Item :"+(i+1));
            Double profit = sc.nextDouble();
            items.add(f.new Item((i+1) , weight , profit));
        }
        System.out.println(maxProfit(items, 15));
        sc.close();
    } 
}

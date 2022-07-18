
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class DuplicateValue2 {
    public void findDuplicates(int[]id){
        System.out.println("Duplicate Student id : ");
        int count[] = new int[10000];
        for(int i = 0 ; i < id.length ; i++){
           count[id[i]]++ ;
           if(count[id[i]] == 2){
            System.out.println(id[i]+ " ");
           }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of student ids in given database : ");
        int n = sc.nextInt();
        int id[] = getInput(n);
        System.out.println("Student id : ");
        printId(id);
        DuplicateValue2 duplicates = new DuplicateValue2();
        duplicates.findDuplicates(id);
        sc.close();
    }
    public static int[] getInput(int n){
        int[] input = new int[n];
        for(int i = 0 ; i< n ; i++){
            input[i] = randomNumber(1,2*n);
        }
        return input;
    }
    public static void printId(int[] id){
        for(int i = 0 ; i < id.length ; i++){
            System.out.print(id[i]+" ");
        }
        System.out.println();
    }
    public static int randomNumber(int min , int max){
        int randomNumber = ThreadLocalRandom.current().nextInt(min,max+1);
        return randomNumber;

    }
}

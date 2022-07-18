import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class JobSchedulingMaxProfit{
    class Job{
        int id;
        int deadline;
        int profit;
        public Job(int id , int deadline ,int profit){
            this.id = id;
            this.deadline = deadline;
            this.profit = profit;
        }
    }
    public static ArrayList<JobSchedulingMaxProfit.Job> maxProfit(ArrayList<Job> jobs){
        int size = jobs.size();
        
        Collections.sort(jobs,new JobSchedulingMaxProfit().new Custom());
        PriorityQueue<Job> max_Profit = new PriorityQueue<>((a,b)->{return b.profit - a.profit;});
        ArrayList<Job> selected = new ArrayList<>();
        for(int i = size-1 ; i >= 0 ; i--){
            int slot = 0;
            if(i == 0){
                slot = jobs.get(i).deadline;
            }
            else{
                slot = jobs.get(i).deadline - jobs.get(i-1).deadline;
            }
            max_Profit.add(jobs.get(i));
            while(slot > 0 && max_Profit.size() > 0){
                selected.add(max_Profit.poll());
                slot--;
            }
        }
        return selected;
    }
    class Custom implements Comparator<Job>{
        @Override
        public int compare(JobSchedulingMaxProfit.Job o1,JobSchedulingMaxProfit.Job o2){
            return o1.deadline - o2.deadline;
        }
    }
    public static void main(String[] args) {
        JobSchedulingMaxProfit j = new JobSchedulingMaxProfit();
        Scanner sc = new Scanner(System.in);
        ArrayList<Job> jobs = new ArrayList<>();
        for(int i = 0 ; i < 5 ;i++){
            System.out.println("Enter the job deadline "+ (i+1));
            int deadline = sc.nextInt();
            System.out.println("Enter the job Profit  "+ (i+1));
            int profit = sc.nextInt();
            jobs.add(j.new Job((i+1), deadline, profit));
        }
        int profit = 0;
        for(Job job : maxProfit(jobs)){
            System.out.println("job" + job.id);
            profit += job.profit;
        }
        System.out.println(profit);
        sc.close();
    }
}
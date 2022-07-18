import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
public class MaxJobs {
    class Job{
        int id;
        int startTime;
        int endTime;
        Job(int id , int startTime , int endTime){
            this.endTime = endTime;
            this.id = id;
            this.startTime = startTime;
        }
    }
    static ArrayList<MaxJobs.Job> maxMeeting(ArrayList<Job> jobs){
        ArrayList<Job> registered = new ArrayList<>();//Allocated Meeting
        Comparator<Job> com = (o1,o2)->{
            return o1.endTime>o2.endTime?1:-1;
        };
        Collections.sort(jobs ,com);
        Job temp = null;
        for(Job job : jobs){
            if(temp == null){
                registered.add(job);
                temp = job;
            }
            else if(temp.endTime < job.startTime){
                temp = job;
                registered.add(job);
            }
        }
        return registered;
    }
    public static void main(String[] args) {
        MaxJobs j = new MaxJobs();
        ArrayList<Job> jobs = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        for(int i =0 ; i< 5 ;i++){
            System.out.println("Enter the job Start Time "+ (i+1));
            int startTime = sc.nextInt();
            System.out.println("Enter the job End Time "+ (i+1));
            int endTime = sc.nextInt();
            jobs.add(j.new Job((i+1), startTime, endTime));
        }
        ArrayList<Job> newjobs = maxMeeting(jobs);
        for(Job job : newjobs){
            System.out.println("job" + job.id);
        }
        System.out.println(newjobs.size());
        sc.close();
    }
}
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
public class MaxJobs1 {
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
    static ArrayList<MaxJobs1.Job> maxMeeting(ArrayList<Job> jobs,int numberOfMeetingRooms){
        
        ArrayList<Job> registered = new ArrayList<>();//Allocated Meeting
        Comparator<Job> com = (o1,o2)->{
            return o1.endTime>o2.endTime?1:-1;
        };
        Collections.sort(jobs ,com);
        Job temp[] = new Job[numberOfMeetingRooms];
        for(Job job : jobs){
            for(int i = 0 ; i < temp.length ; i++){
                if(temp[i] == null){
                    registered.add(job);
                    temp[i] = job;
                    System.out.println("Room no :"+ (i+1));
                    break;
                }
                else if(temp[i].endTime < job.startTime){
                    temp[i] = job;
                    System.out.println("Room no :"+(i+1));
                    registered.add(job);
                    break;
                }
            }
           
        }
        return registered ;
    }
    public static void main(String[] args) {
        MaxJobs1 j = new MaxJobs1();
        ArrayList<Job> jobs = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i =0 ; i< 6 ;i++){
            System.out.println("Enter the job Start Time "+ (i+1));
            int startTime = sc.nextInt();
            System.out.println("Enter the job End Time "+ (i+1));
            int endTime = sc.nextInt();
            jobs.add(j.new Job((i+1), startTime, endTime));
        }
        ArrayList<Job> newjobs = maxMeeting(jobs , n);
        for(Job job : newjobs){
            System.out.println("job" + job.id);
        }
        System.out.println(newjobs.size());
        sc.close();
    }
}

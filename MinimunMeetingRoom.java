import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
public class MinimunMeetingRoom {
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
    static int minMeeting(ArrayList<Job> jobs){
        Comparator<Job> com = (o1,o2)->{
            return o1.startTime>o2.startTime?1:-1;
        };
        ArrayList<Job> rooms =  new ArrayList<>();
        Collections.sort(jobs ,com);
        for(Job job : jobs){
            if(rooms.size() == 0){
                rooms.add(job);
            }
            else{
                boolean scheduled = false;
                for(Job inJob : rooms){
                    scheduled = false;
                    if(inJob.endTime < job.startTime){
                        rooms.remove(inJob);
                        rooms.add(job);
                        scheduled = true;
                        break;
                    }

                }
                if(!scheduled){
                    rooms.add(job);
                }
            }
        }
        return rooms.size();
    }
    public static void main(String[] args) {
        MinimunMeetingRoom j = new MinimunMeetingRoom();
        ArrayList<Job> jobs = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        for(int i =0 ; i< 6 ;i++){
            System.out.println("Enter the job Start Time "+ (i+1));
            int startTime = sc.nextInt();
            System.out.println("Enter the job End Time "+ (i+1));
            int endTime = sc.nextInt();
            jobs.add(j.new Job((i+1), startTime, endTime));
        }
        // ArrayList<Job> newjobs = minMeeting(jobs);
        // for(Job job : newjobs){
        //     System.out.println("job" + job.id);
        // }
        System.out.println(minMeeting(jobs));
        sc.close();
    }
}

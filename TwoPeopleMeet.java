public class TwoPeopleMeet {
    public static boolean willTheyMeet(int p1 , int s1 , int p2 , int s2){
        if((p1<p2 && s1<s2) || (p2< p1 && s2 < s1) || s1==s2){
            return false;
        }
        else if(p1>p2){
            return (( p1 - p2 ) % ( s2 - s1 ) == 0);
        }
        else if(p2>p1){
            return (( p2 - p1 ) % ( s1 - s2 ) == 0);
        }
        return false;
    }
    public static boolean willTheyMeetWhile(int p1 , int s1 , int p2 , int s2){
        if(p1>p2){
            while(p2 < p1){
                p2 += s2;
                p1 += s1;
                if(p1 == p2){
                    return true;
                }
            }
        }
        else if( p2 > p1){
            while(p1 < p2){
                p2 += s2;
                p1 += s1;
                if(p1 == p2){
                    return true;
                }
            }
        }
        return false;
    }
}

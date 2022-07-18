import java.util.Scanner;

class Palindrome {
   public static boolean palindrome(int[] num, int index) {
   //write the logic here  
    if(index > num.length/2){
        return true;
    }
    else if(num[index] == num[num.length - 1 - index]){
        return palindrome(num , index+1);
    }
    else{
        return false;
    }
    
  }

   public static void main(String args[]) {
       Scanner sc = new Scanner(System.in);
       int num[] = new int[5];
       for(int i=0; i< 5;i++)
           num[i]=sc.nextInt();
       boolean answer =palindrome(num, 0);
       System.out.println(answer);
       sc.close();
   }
}

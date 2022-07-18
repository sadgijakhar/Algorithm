import java.util.Scanner;
/* Insertion Sort
Description
There is a total of N students in Professor X’s school for mutants. Each student has a first name as well as a last name, maintained separately in two separate database columns. One day, Professor X asks a student named Logan to copy the items of both these columns in two separate arrays and sort them using insertion sort. However, the first names should be in ascending order and the last names in descending order. Logan never used insertion sort on an array of strings, so he’s seeking for help. Write a function that takes an array of strings as input and returns the sorted array as output. Assume that the names can only be in lowercase.

Input:
      1. The first line will be 'n', the size of the two arrays.
      2. The next 'n' lines are the first name of the students.
      3. The next 'n' lines are the last name of the students.

Output:
       1. The first 'n' lines are first names arranged in ascending order.
       2. The next 'n' lines are the last names arranged in descending order.

HINT: You can use the compareTo() method to compare two strings lexically.
 */
 class InsertionUpgrad {
    public static void sort(String first[] , String last[]){
        for(int i = 1 ; i < first.length ; i++){
            String key = first[i];
            int j = i - 1;
            while((first[i].compareTo(first[j]) < 0) && j>=0){
                first[i] = first[j];
                first[j] = key;
                if(j>0){
                    j--;
                    i--;
                }
            }
        }
        for(int i = 1 ; i < last.length ; i++){
            String key = last[i];
            int j = i - 1;
            while((last[i].compareTo(last[j]) > 0) && j>=0){
                last[i] = last[j];
                last[j] = key;
                if(j>0){
                    j--;
                    i--;
                }
            }
        }
    }

   public static void main(String ss[]) {
       Scanner scanner = new Scanner(System.in);
       int size = scanner.nextInt();
       String firstNames[] = new String[size];
       String lastNames[] = new String[size];
       for (int i = 0; i < size; i++) {
           firstNames[i] = scanner.next().toLowerCase();
       }
       for (int i = 0; i < size; i++) {
           lastNames[i] = scanner.next().toLowerCase();
       }
       sort(firstNames, lastNames);
       for(int i = 0 ; i < size ; i++){
        System.out.println(firstNames[i]);
       }
       for(int i = 0 ; i < size ; i++){
        System.out.println(lastNames[i]);
       }
       scanner.close();

       //Write your code here
   }
}

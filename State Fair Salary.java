import java.util.*;
class Solution{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int sal = sc.nextInt();
        /* let x is no of hours on weekend
            so 10x is no of hours in weekdays
            So, 50x + 80(10+x) = sal
            no of hour in weekend = sal/850;
        */
        int x = (sal-800)/130;
        x -= 5;
        System.out.println(10+x + "\n" + x);
    }
}

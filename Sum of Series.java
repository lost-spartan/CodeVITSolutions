// You are using Java
import java.util.*;
import java.lang.Math;

class Solution{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Solution s = new Solution();
        int val = sc.nextInt();
        int term = sc.nextInt();
        int sum = 0;
        double a;
        
        for(int  i=0; i<term; i++){
            a = (Math.pow(-1,i) + Math.pow(val,i*2))/s.Factorial(i*2);
            sum = sum + (int)a;
        }
        
        System.out.println(sum);
    }
    static int Factorial(int a){
        int fact = 1;
        for(int i=1;i<=a;i++){
            fact = fact*i;
        }
        return fact;
    }
}

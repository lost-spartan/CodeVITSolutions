// You are using Java
import java.util.*;
import java.lang.Math;
import java.text.DecimalFormat;

class Solution{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Solution s = new Solution();
        DecimalFormat df = new DecimalFormat("0.00");
        int val = sc.nextInt();
        int term = sc.nextInt();
        double sum = 0;
        double a;
        
        for(int  i=0; i<term; i++){
            a = (Math.pow(-1,i) * Math.pow(val,i*2))/s.Factorial(i*2);
            sum = sum + a;
        }
        
        System.out.println(df.format(sum));
    }
    static int Factorial(int a){
        int fact = 1;
        for(int i=1;i<=a;i++){
            fact = fact*i;
        }
        return fact;
    }
}

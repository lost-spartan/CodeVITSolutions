// You are using Java
import java.util.*;
class Solution{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum, fact, rem;
        for(int i=a; i<b; i++){
            int num1 = i;
            int num2 = i;
            sum = 0;
            while(num1 != 0){
                fact = 1;
                rem = num1 % 10;
                num1 = num1 / 10;
                for(int j=1; j<rem+1; j++){
                    fact = fact * j;
                }
                sum = sum + fact;
            }
            if(sum == num2)
                System.out.println(i);
        }
    }
}

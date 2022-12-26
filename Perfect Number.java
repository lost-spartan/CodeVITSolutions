import java.util.*;
class Solution{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = 0;
        for(int i=1; i<=a; i++){
            if(a%i == 0){
                b += i;
            }
        }
        if(b == 2*a){
            System.out.println(a + " is a perfect number");
        }else
            System.out.println(a + " is not a perfect number");
    }
}

import java.util.*;

public class Main{
public static void main(String args[])
{
    Scanner sc = new Scanner(System.in);
    int n, count=1, k=1;
    n = sc.nextInt();
    
    int[] arr = new int[n];
    
    for(int i=0; i<n; i++)
    {
        arr[i] = sc.nextInt();
    }
    for(int i=0; i<n; i++)
    {
        for(int j=i+1; j<n; j++)
        {
            if((arr[i]==arr[j])&&(arr[i]>=0))
            {
                arr[j] =-1;
                count++;
                if(k==1){
                    System.out.println("Similar element : " + arr[i]);
                    System.out.print("Positions : " +  i+1);
                    k=0;
                }
                System.out.println(" " + j+1);
            }
        }
        if(count > 1){
            System.out.println("Occurence : " + count);
        }
        count = 1; k = 1;
    }
    
}
}

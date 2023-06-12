import java.util.Scanner;
import java.util.ArrayList;

class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        int n = sc.nextInt();   //size;
        int[][] arr = new int [n][n];
        
        int top = 0, bottom = n-1, left = 0, right = n-1, count = 0;
        
        for(int i = 0; i < n*n; i++){
            list.add(sc.nextInt());
        }
        
        while(top <= bottom && left <= right){
            for(int i=left; i<=right; i++){
                
                arr[top][i] = list.get(count);
                count++;
                //System.out,println(arr[top][i]);
            }
            top++;
            
            for(int i=top; i<=bottom; i++){
                
                arr[i][right] = list.get(count);
                count++;
                //System.out.println(arr[i][right]);
            }
            right--;
            
            if(top <= bottom){
                for(int i=right; i>=left; i--){
                    
                    arr[bottom][i] = list.get(count);
                    count++;
                    //System.out.println(arr[bottom][i]);
                }
                bottom--;
            }
            
            if(left <= right){    
                for(int i=bottom; i>=top; i--){
                    
                    arr[i][left] = list.get(count);
                    count++;
                    //System.out.println(arr[i][left]);
                }
                left++;
            }
        }
        
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print(" " + arr[i][j]);
            }
            System.out.println("");
        }
    }
}

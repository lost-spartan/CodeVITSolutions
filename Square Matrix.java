import java.util.*;
class solution{
    public static void main(String args[]){
        Scanner sc  =  new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int [][] arr = new int [a][b];
        for(int i=0; i< a; i++){
            for(int j=0; j<b; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        for(int i=0;i<a;i++){
            for(int j=0;j<b;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("");
        }
        if(a == b)
            System.out.println("The entered array is a square matrix.");
        else
            System.out.println("The entered array is not a square matrix");
        
    }
}

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 } { 7, 8, 9} };
		int n = arr.length;
		System.out.println(result(arr,n));
	}
	public static int result(int[][] arr, int n){
	    int res=0;
	    for(int i=0; i<n ; i++){
	        res = res + arr[0][i] + arr[n-1][i];
	    }
	    for(int i=0; i<n; i++){
	        for(int j=0; j<n; j++){
	            if(i == j){
	                res = res + arr[i][n-1 -i];
	            }
	        }
	    }
	    return res - arr[0][n-1] - arr[n-1][0];
	}
}

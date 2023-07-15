// Not rotating an array just printing rotated array;

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9} };
		int n = arr.length;
		result(arr, n);
	}
	public static void result(int[][] arr, int n){
	    for(int j=0; j<n; j++){
	        for(int i= n-1; i>=0; i--){
	            System.out.print(arr[i][j] + " ");
	        }
	        System.out.println();
	    }
	}
}

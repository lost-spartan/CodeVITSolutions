import java.util.*;
public class Main
{
	/* 
    public static void add(int[] arr){
	    if(arr[arr.length - 2] == 9){
	        arr[arr.length - 2] = 0;
	        add(arr.remove(arr.length - 2));
	        return;
	    }else{
	        arr[arr.length - 2] = arr[arr.length - 2] + 1;
	        return;
	    }
	} 
 */
	
	public static void add(ArrayList<Integer> arr){
	    if(arr.get(arr.size() - 1 ) == 9){
	        arr.remove(arr.size() - 1);
	        add(arr);
	        arr.add(0);
	    }else{
	        int a = arr.get(arr.size() - 1);
	        arr.set(arr.size() - 1, a + 1);
	    }
	}
	
	public static void print(int[] arr){
	    for(int i=0; i<arr.length; i++){
	        System.out.print(arr[i] + ", ");
	    }
	}
	
	public static void main(String[] args) {
		//int[] arr = new int[]{1,2,3,4,5,6,7,8,9}; 
		
    ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(9);
        arr.add(9);
		add(arr);
		System.out.print(arr);
		
    //print(arr);
		
	}
}

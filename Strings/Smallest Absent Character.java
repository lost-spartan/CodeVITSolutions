import java.util.*;

public class Main
{
	public static void main(String[] args) {
		String str = "barcelona";
		smallestChar(str);
	}
	
	public static void smallestChar(String str){
	    char[] arr = str.toCharArray();
	    Arrays.sort(arr);
	    
    for(int i=0; i<arr.length; i++){
	      if(arr[i + 1] != arr[i] + 1 && arr[i + 1] != arr[i]) {
	          System.out.println((char)(arr[i] + 1));
	          break;
	      } 
	    }
	}
}

import java.util.*;

public class Main
{
	public static void main(String[] args) {
		String str = "ccbb";
		smallestChar(str);
	}
	
	public static void smallestChar(String str){
	    ArrayList<Character> lst = new ArrayList<>();
	    
	    for(int i=0; i<26; i++){
	        lst.add((char)('a'+i));
	    }
	    
	    for(int i=0; i< str.length(); i++){
	        char a = str.charAt(i);
	        lst.remove(Character.valueOf(a));
	    }
	    
	    System.out.println(lst.get(0));
	}
}

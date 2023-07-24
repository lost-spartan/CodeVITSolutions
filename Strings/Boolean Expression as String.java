// You are using Java
/*
Given a string consisting of only 0, 1, A, B, C where 
A = AND 
B = OR 
C = XOR 
Calculate the value of the string assuming no order of precedence and evaluation is done from left to right.
Constraints – The length of string will be odd. It will always be a valid string. 
Example, 1AA0 will not be given as an input.
*/

import java.util.*;

public class Main{
    public static void main(String args[]){
        String str = "0c0c1c1a0b1";     // 0 -> 48 , 1 -> 49
        result(str);
    }
    
    public static void result(String str){
        int len = str.length();
        int ans = (int) str.charAt(0) - 48;
        
        for(int i=1; i<len; i+=2){
            if(str.charAt(i) == 'a'){
                ans = ans & (str.charAt(i+1) - 48);
            }else if(str.charAt(i) == 'b'){
                ans = ans | (str.charAt(i+1) - 48);
            }else if(str.charAt(i) == 'c'){
                ans = ans ^ (str.charAt(i+1) - 48);
            }
        }
        System.out.println(ans);
    }
}

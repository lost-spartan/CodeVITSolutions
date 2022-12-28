import java.util.*;
import java.text.DecimalFormat;
class Solution {
	public static void main(String [] args) {
		int num1,num2,num3;
		float rate1,rate2,rate3,result = (float) 0.0;
		DecimalFormat d  = new DecimalFormat("0.00");
		Scanner sc = new Scanner(System.in);
		num1 = sc.nextInt();
		rate1 = sc.nextFloat();
		num2 = sc.nextInt();
		rate2 = sc.nextFloat();
		num3 = sc.nextInt();
		rate3 = sc.nextFloat();
		result = ((num1*rate1)+(num2*rate2)+(num3*rate3))/(num1+num2+num3);
		System.out.println(d.format(result));
		
	}
}

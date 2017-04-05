package forbes;

import java.util.Scanner;

/** GreatestCommonMultiple
 * To find the greatest common multiple
 * April 3, 2016
 * @author Ainslie Forbes
 */
public class GreatestCommonMultiple {
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Please entre a number");
		int n =sc.nextInt();
		System.out.println("Please entre an other number");
		int m =sc.nextInt();
		greatestCommonMultiple(n, m);
		System.out.println(greatestCommonMultiple(n, m));
		sc.close();
	}
	public static int greatestCommonMultiple(int num1, int num2){
		int small = Math.min(num1, num2);
		int big = Math.max(num1, num2);
		int o = small;
		while (big % o > 0 || small % o > 0){
			o--;
		}
		return o;
	}
}

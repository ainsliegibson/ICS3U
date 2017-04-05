package forbes;

import java.util.Scanner;
/** IsDivisible
	 * To determine if the numbers are divisible
	 * April 3, 2016
	 * @author Ainslie Forbes
	 */
public class IsDivisible {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please entre a number");
		int n =sc.nextInt();
		System.out.println("Please entre an other number");
		int m =sc.nextInt();
		isDivisible(n, m);
		System.out.println(isDivisible(n, m));
		sc.close();
	
	}
	public static boolean isDivisible(int a, int b){
		//a = Math.max(a, b);
		//b = Math.min(a, b);
		if (a % b == 0){
			return true;
		}
		return false;
	}
}

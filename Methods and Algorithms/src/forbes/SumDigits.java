 
package forbes;

import java.util.Scanner;
/** SumDigits
 * To determine the sum of the digits
 * April 3, 2016
 * @author Ainslie Forbes
 */

public class SumDigits {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please entre a number");
		int m = sc.nextInt();
		sumOfDigits(m);
		System.out.println(sumOfDigits(m));
		sc.close();
	}
	
	public static int sumOfDigits(int n){
		int x = 0;
		while (n > 0){
			x = (n % 10) + x;
			n = n/10;
		}
		return x;
	}
}

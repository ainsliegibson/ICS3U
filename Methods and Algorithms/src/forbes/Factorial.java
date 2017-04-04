package forbes;

import java.util.Scanner;

/** Factorial
 * To determine the factorial of a number
 * April 3, 2016
 * @author Ainslie Forbes
 */

public class Factorial {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please entre a number");
		int n = sc.nextInt();
		factorial(n);
		sc.close();
	}
	public static int factorial(int num){
		int x = 1;
		if (num == 0){
			return 1;
		}
		else if (num < 0){
			return -1;
		}
		else{
			while (num > 0){
				x = num * x;
				num--;
			}
			return x;
		}
	}
}

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
		//Imputing a number
		System.out.println("Please enter a number");
		int n = sc.nextInt();
		factorial(n);
		System.out.println(factorial(n));
		sc.close();
	}
	public static int factorial(int num){
		int x = 1;
		if (num == 0){
			return 1;
		}
		else if (num < 0){
			return -1;
			//error
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

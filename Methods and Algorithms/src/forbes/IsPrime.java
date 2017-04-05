package forbes;

import java.util.Scanner;

/** IsPrime
 * To check if a number is prime
 * April 3, 2016
 * @author Ainslie Forbes
 */
public class IsPrime {
	
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please entre a number");
		int n = sc.nextInt();
		isDivisible(n, n-1);
		sc.close();
		System.out.println(isPrime(n));
	}
	
	public static boolean isDivisible(int a, int b){
		if (a % b == 0){
			return true;
		}
		return false;
	}

	public static boolean isPrime(int a){
		int b = a - 1; 
		while (!isDivisible(a,b)) {
			b --;
			if (b == 1){
				return true;
			}

		}
		return false;

	}
}

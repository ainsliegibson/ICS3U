package forbes;
/** LargestValue
 * To determine which number is the biggest
 * April 3, 2016
 * @author Ainslie Forbes
 */

import java.util.Scanner;

public class LargestValue {
	public static void main (String[] args) {
		int [] stupidArray = new int [10];
		Scanner sc = new Scanner(System.in); 
		System.out.println("Please enter 10 numbers");
		for (int n = 0; n < 10; n++){
			stupidArray [n] = sc.nextInt();
		}
			largestValue(stupidArray);
			sc.close();
	}
	public static int largestValue(int [] numbers){
		int max = numbers[0];
		for (int i = 0; i < numbers.length; i ++){
			max = Math.max(max,  numbers[i]);
		}
		return max;
	}
}

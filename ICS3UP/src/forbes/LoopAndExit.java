package forbes;
/** LoopAndExit.java
 * This program loop a program until user presses enter
 * @author ainslieforbes
 * Apr 19
 */
import java.util.Scanner;

public class LoopAndExit{
	public static void main (String args[]){
		Scanner sc = new Scanner(System.in);
		String end = null;
		for(int m = 1; m > 0; m--){ //counting variable
			System.out.println("Please enter a sentence");
			end = sc.nextLine();
			if ((isEnter(end)) == false){//checks to if method is false
				System.out.println(end);// if method is false print variable and restart
				m = 2;
			} 
		}
		sc.close();
	}

	public static boolean isEnter(String nothing){//enter method
		if (nothing.equals("")){//determine if user pressed enter
			return true;
		}
		else{
			return false;
		}
	}
}


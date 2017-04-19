package forbes;
/** Palindrome.java
 * This program determines if a sentence is a Palindrome and returns true or false
 * @author ainslieforbes
 * Apr 19
 */
import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String sentence = null;//input variable
		for(int m = 1; m > 0; m--){//exitAndLoop method
			System.out.println("Please enter a sentence");//get sentence
			sentence = sc.nextLine();
			if ((isEnter(sentence)) == false){
				System.out.println(sentence);	
				m = 2;
				String word = noSpace(sentence);//send to noSpace method
				System.out.println(isPalindrome(word)); 
				//sent to isPalindrome and print true or false to console 
			}

		}
		sc.close();
	}
	public static boolean isPalindrome(String letters){ 
		//determines if the sentence is palindrome
		int n = letters.length() - 1; 
		//counting variable will start at the end of the sentence

		for (int i = 0; i < letters.length(); i++){ 
			//for loop will start at the beginning of the sentence
			// comparing the first and last letter of the sentence
			if(letters.charAt(i) == letters.charAt(n)){ 
				//if they are the same continue in the loop
				n--;
			}
			else{
				//if they are the different return false
				return false;
			}
		}
		//if they are all the same return true
		return true;

	}
	public static String noSpace(String word){
		//take a sentence and returns it in capitals and without period, space, commas, etc.
		String space ="";
		word = word.toUpperCase();//makes the sentence all upper-case
		//counting variable to check every space in the String
		for (int i = 0; i < word.length(); i ++){
			// check if the spaces in String is a capital letter (not a space, period, etc.)
			if ((((Character)(word.charAt(i))).toString().matches("[A-Z]")) == true){
				//add each char that is a capital letter to a new String
				space = space + word.charAt(i);		
			}
			//if not a capital letter it will be skipped and not added to the new String
		}
		return space;//sends the new String with only capital letters
	}
	public static boolean isEnter(String nothing){
		//loops until user presses enter without letter/number
		if (nothing.equals("")){//check if there is an enter
			return true;
		}
		else{
			return false;
		}
	}
}

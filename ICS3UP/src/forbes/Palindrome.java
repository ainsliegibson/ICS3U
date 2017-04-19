package forbes;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a sentence");
		String sentence = sc.nextLine();
		sc.close();
		String word = noSpace(sentence);
		System.out.println(isPalindrome(word));
	}
	public static boolean isPalindrome(String letters){
		int n = letters.length() - 1;
		for (int i = 0; i < letters.length(); i++){
			if(letters.charAt(i) == letters.charAt(n)){
				n--;
			}
			else{
				return false;
			}
		}
		return true;

	}
	public static String noSpace(String word){
		String space ="";
		word = word.toUpperCase();
		for (int i = 0; i < word.length(); i ++){
			if ((((Character)(word.charAt(i))).toString().matches("[A-Z]")) == true){
				space = space + word.charAt(i);	
			}
		}
		return space;
	}
}

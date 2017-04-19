package forbes;
/** RightAngleTriangle.java
 * This program tells what are all the possible number between 1-100 that would make a perfect right triangle
 * @author ainslieforbes
 * Apr 19
 */
public class RightAngleTriangle {

	public static void main(String[] args) {
		for(int a = 1; a <= 100; a++){ //triangle side, starts on 1 and goes to 100
			for (int b = 1; b <= 100; b++){// triangle side, starts on 1 and goes to 100
				int c = (int)((Math.pow(a, 2)) + (Math.pow(b, 2))); //Pythagorean Theorem

				if (isSquare(c)){ //sends to isSquare method
					System.out.println(a + ", " + b + ", "+ (int)(Math.sqrt(c)));
					//prints out possibilities
				}	
			}
		}
	}
	public static boolean isSquare(int n){
		//determines if it is a perfect square
		int srt = (int)(Math.sqrt(n));
		//gets the square root of a number and puts it into an int(cuts off any decimal places
		double check = Math.pow(srt, 2); 
		//square the number that was just square rooted to see if it matches the original number
		if (n == check){//if it does match return true
			return true;
		}
		else{//if it does not match return false
			return false;
		}
	}

}

package forbes;

//import java.util.Scanner;

public class PerfectInteger {

	public static void main(String[] args) {
		//Scanner sc = new Scanner(System.in);
		int given = 100; //can uncomment code to make user input a max number
		//System.out.println("Please enter max number");
		//given = sc.nextInt();
		for(int m = 1; m < given; m++){ 
			if(isPerfect(m) == true){
				System.out.println(m);
			}
		}
		//sc.close();
	}
	public static boolean isPerfect(int n){
		int x = 0;
		for(int i = n - 1; i > 0; i--){
			if(n % i == 0){
			//counts down and adds all the number if they are multiples of the number 
			x = i + x;
			}
		}
		//compares if the numbers are the same 
		if(n == x){
			return true;
		}
		else{
			return false;
		}
	}

}

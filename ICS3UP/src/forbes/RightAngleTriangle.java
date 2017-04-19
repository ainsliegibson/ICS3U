package forbes;

public class RightAngleTriangle {

	public static void main(String[] args) {
		for(int a = 1; a <= 100; a++){ 
			for (int b = 1; b <= 100; b++){
				int c = (int)((Math.pow(a, 2)) + (Math.pow(b, 2)));

				if (isSquare(c)){
					System.out.println(a + ", " + b + ", "+ (int)(Math.sqrt(c)));
				}	
			}
		}
	}

	public static boolean isSquare(int n){
		int srt = (int)(Math.sqrt(n));
		double check = Math.pow(srt, 2);
		if (n == check){
			return true;
		}
		else{
			return false;
		}
	}

}

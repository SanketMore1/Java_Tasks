
public class Test1 {

	public static void main(String[] args) {
		
		
		// task - armstrong number =  (123) = sum of cube of each digit
		
		int number=153;
		
		int backup = number;
		int digit;
		int sum =0;
		while(number!=0) {
			digit = number %10;
			
			sum = (int) (sum+Math.pow(digit,3));
			number = number/10;
		}
		
		if(backup== sum) {
			System.out.println("Given number is amstrong number");
		}else{
			System.out.println("Given number is not amstrong number");
		}
	}

}

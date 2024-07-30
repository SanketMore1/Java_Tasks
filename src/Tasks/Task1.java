package Tasks;

public class Task1 {

	public static void main(String[] args) {
		
//		int first = 10;
//		
//		int second =5;
//		
//		int result ;
//		
//		result = second % 2;
//		
//		if(second % 2 ==0) {
//			System.out.println("No is Even");
//		}else {
//			System.out.println("No is odd");
//		}
//		
//		System.out.println(result);
//		
//		
	
		// task -3 
//		Objective: Calculate the discount based on the purchase amount.
//		Instructions:
//		1. Declare a variable to store the purchase amount.
//		2. Use if-else statements to apply the discount:
//		 - If the amount is greater than $500, apply a 20% discount.
//		 - If the amount is between $200 and $500, apply a 10% discount.
//		 - If the amount is less than $200, apply a 5% discount.
//		3. Calculate the final amount after applying the discount.
//		4. Print the final amount after the discount
//		
		
		int amount =300;
		
		if(amount>500) {
			amount = amount - amount/5;
		}else if(amount>=200 && amount<=500) {
			amount = amount - amount/10;
		}else if(amount<200) {
			amount = amount - amount/20;
		}
		
		System.out.println("The amount after discount is : "+ amount);
		
		
	}

}

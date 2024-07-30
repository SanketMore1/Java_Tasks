package string_Problems;

import java.util.Arrays;

public class String_2 {

	public static void main(String[] args) {
		
		
		
		// task - count words in a string
		
//		String s1 = "count words in a string";
//		// spaces = 3
//		//words = 4
//		
//		String s2 ="This_1_is_2_rainy";
//		// spaces = 2
//		// words = 3
//		
//		String s3 ="This_1_is";
//		// spaces = 1
//		// words = 2
//		
//		String s4 ="This";
//		// spaces = 0
//		// words = 1
//		
//		int spaces =0;
//		for(int i=0;i<s1.length();i++) {
//			if(s1.charAt(i)==' ') {
//				spaces++;
//			}
//		}
//		
//		System.out.println("The no. of spaces : "+spaces);
//		System.out.println("The no. of words : "+ (spaces+1));
//		
		// task - check given strings are anagram or not
		// angel = glean ,    cat = act
		
//		String s1 = "cat";
//		
//		String s2 = "bct";
		
		// cat, act, tac ,tca    !=>>>> bat     anagram
		
		
//		boolean flag = false;
//		
//		for(int i=0;i<s1.length();i++) {
//			
//			
//			for(int j=0;j<s2.length();j++) {
//				
//				if(s1.charAt(i)==s1.charAt(j)) {
//					
//					flag= true;
//					
//				}
//				
//				
//			}
//		
//			
//			
//		}
//		if(flag==false) {
//			System.out.println("Not an anagram");
//			
//		}
		
		// task - check given strings are anagram or not
		// angel = glean ,    cat = act
		
//		String s1 = "cat";
//		
//		String s2 = "act";	
//		
//		char ch1[] = s1.toCharArray();
//		
//		char ch2[] = s2.toCharArray();
//		
//		
//		// ch1 [] = {'c' , 'a', 't'}, 
//		
//		// ch2 [] = {'t' , 'c', 'a'}, 
//		
//		
//		Arrays.sort(ch1);
//		
//		// ch1 [] = {'a' , 'c', 't'}, 
//		
//	Arrays.sort(ch2);
//		
//		// ch1 [] = {'a' , 'c', 't'}, 
//	boolean result = Arrays.equals(ch1, ch2);
	
//	System.out.println(result);
		
		
	// task - reverse words in string
		
		String s = "you are doing great";
		// index  i  0   1    2    3
		
		
		//=>> great doing are you
		
		
		// 'y','o','u' 'a','r','e'  =>> are you
		
		String [] store =  s.split(" ");
		
		for(int i=store.length-1;i>=0;i--) {
			System.out.print(store[i]+ " ");
		}
		
		
		
		
		
		
	}

}

package string_Problems;

import java.util.HashMap;
import java.util.Map.Entry;

public class Intro {

	public static void main(String[] args) {
		
		
		
	

		//String s = "India is great nation ";	
		// String s = "INDIA is GREAT nation ";
		//System.out.println(s);

//		
	//	char c = s.charAt(4);   
//		
//		s=s.toLowerCase();
//		
//		int length = s.length();
//		
//		System.out.println(length);
//		
//		String store = s.substring(9,14);
//		
	//     s = s.replace("India", "INDIA");
		
		
		//char ch[] = s.toCharArray();
		//{I,n,d,i,a, ,i,s, ,g,r,e,a,t, ,n,a,t,i,o,n,}
		
		//char ch[] = {'I','N','D','I','A'};
		 // index     0   1   2   3   4
		  //          ch[0]
		
//		String reverse ="";
//		for(int i=ch.length-1;i>=0;i--) {
//		reverse = reverse + ch[i];
////		
//		}
//		
//		System.out.println(reverse);
//		
		
	//	String s = "Bottle";
		// index    012345
		 // elttoB
		
		
//		
//		char ch[] = s.toCharArray();
//		
//		String reverse ="";
//		for(int i = s.length()-1;i>=0;i--) {
//			
//			reverse = reverse+ch[i];
//		}
//		System.out.println(reverse);
//		
		// palindrome
		
		// WOW
		// reverse = WOW
		// Palindrome
		
		//NOW
		// 012
		// 210
		// WON
		
		// reverse = WON
		// NOT Palindrome
		
//		
//		String s = "WOW";
//		
//		
//		String reverse="";
//		
//		char ch[] = s.toCharArray();
//		
//		for(int i=ch.length-1;i>=0;i--) {
//			
//			reverse = reverse + ch[i];
//			
//		}
//		
//		if(s.equalsIgnoreCase(reverse)) {
//			System.out.println("Palindrome");
//		}else {
//			System.out.println("NOT a Palindrome");
//		}
//		
//		
//		 String s = "INDIA IS GREAT NATION WE indian ";
//			//  2
//		
//		
//		char ch[] = s.toCharArray();
//		 
//		int count =0;
//		
//		for(int i=0;i<s.length();i++) {
//			
//			if(ch[i]=='I') {
//				count++;
//			}
//			
//		}
//		
//		System.out.println("Number of times I apperared in s :"+count);
//		
		
	// task -1 - find the length of given string
		
		//String s = "INDIA";
		
//		int length = s.length();
//		
//		System.out.println(length);
		
		// # 
		
//		char [] ch = s.toCharArray();
//		
		// ch = {'I','N','D','I','A'};
		// index  0   1   2   3   4
		// ch    [0]  [1]
		
//		int size=0;
//		for(int i=0;i<ch.length;i++) {
//			size++;
//		}
//		
//		System.out.println(s + " size is : "+size);
//		System.out.println(ch.length);
//		
//		
		// task -2 - counting vowels and consonants in given string
		
//		String s = "India";
//		// v= 3  c =2   total =5
//		// vowels = {a,e,i,o,u}
//		s= s.toUpperCase();
//		int count = 0;
//		for(int i=0;i<s.length();i++) {
//			
//			if(s.charAt(i)=='A' ||s.charAt(i)=='E'||s.charAt(i)=='I' 
//				||	s.charAt(i)=='O' ||s.charAt(i)=='U'	) {
//				count++;
//			}
//			
//		}
//		
//		
//		System.out.println("Vowels : "+count);
//		System.out.println("Consonats in string : "+ (s.length()-count));
//		
		
		// task -3 - remove white spaces in given string
			
	//	String s = "INDIA IS MY COUNTRY ";
		
		// result = INDIAISMYCOUNTRY
		
		// # using in-built method
		
		// # custom
		
		// converting to char array
		
		// charAt() single character
		
//		String result ="";
//		for(int i=0;i<s.length();i++) {
//			
//			if(s.charAt(i)!=' ') {
//				result = result + s.charAt(i);
//			}
//			
//		}
//		
//		System.out.println(result);
//		
		
		// task - 4 - palindrome checker
		
//		String s = "NOW";
//		
//		char ch [] = s.toCharArray();
//		
//		String reverse ="";
//		for(int i=ch.length-1;i>=0;i--) {
//			reverse = reverse+ ch[i];
//		}
//		
//		if(s.equalsIgnoreCase(reverse)) {
//			System.out.println("YES it is palindrome");
//		}else {
//			System.out.println(" it is not a palindrome");
//		}
//	String s = "NOW";
	
	
	// MADAM
	//     M   A  D  A   M         
// index   0   1  2  3   4
	
// var     i>  -     -    j
	
	
	// #### DSA TWO pointer technique
//	
//		int i,j;
//		boolean flag = false;
//		for(i=0,j= s.length()-1;i<=j;i++,j--) {
//			
//			if(s.charAt(i)!= s.charAt(j)) {
//				System.out.println("Not a palindrome");
//				flag = true;
//			}
//		}
//		
//		if (flag == false ) {
//			System.out.println(" palindrome");
//		}
//		
	String s = "INDIA IS MY COUNTRY ";
	s= s.toUpperCase();
//	HashMap<Character,Integer> hm = new HashMap<>();
//	
//	for(int i=0;i<s.length();i++) {
//		int val =0;
//		if(hm.get(s.charAt(i))!=null) {
//			val = hm.get(s.charAt(i));
//		}else {
//			val= 1;
//		}
//		hm.put(s.charAt(i),hm.get(s.charAt(i))+1);
//	}
//	
//	
//	for (Entry<Character, Integer> entry : hm.entrySet()) {
//		Character key = entry.getKey();
//		 Integer val = entry.getValue();
//		System.out.println(key  +" = "+ val);
//	}
	
	char ch[] = s.toCharArray();
	boolean flag = false;
	for(int i=0;i<s.length()-1;i++) {
		if(ch[i]==' ') {
			flag = true;
		}
		while(flag == true && i<s.length()-1) {
			ch[i]=ch[i+1];
		}
	}
	
	for(Character c :ch ) {
		System.out.print(c);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}

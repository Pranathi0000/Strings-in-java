package strings;

import java.util.Scanner;

public class StringMethods {

	public static void main(String[] args) {
		
		Scanner obj=new Scanner(System.in);
		
		String s1=obj.nextLine();
		
		System.out.println(s1);
		
		System.out.println(s1.charAt(3));  //return a character at that index
		
		System.out.println(s1.codePointAt(2)); //return an integer (ASCII value) of the character at that index
		
		System.out.println(s1.codePointBefore(2));//returns the ascii value of the character before the index
		
		System.out.println(s1.codePointCount(1,4)); // returns the value of higherIndex-lowerIndex
		
		String s2="abc",s3="abc",s4="hello world",s5="rld",s6="ABC",s7="ABC",s8="ABC";
		
		System.out.println(s2.compareTo(s3));// returns 0 if both strings are same or else other value
		
		System.out.println(s2.compareToIgnoreCase(s3));// doesn't care which case the character is
		
		System.out.println(s1.concat(s2)); // appends s2 to s1
		
		System.out.println(s1.contains("p")); // if the character is present returns true or else false
		
		System.out.println(s1.contains(s2));	// checks for the s2 string in s1	
		
		System.out.println(s1.contentEquals("hello world")); // if the string matches with s1 returns true or else false
		
		System.out.println(s1.endsWith("rld"));//returns true if the word ends with rld or else false
		
		System.out.println(s1.equals("Pranathi"));// checks whether the string is equal to s1
		
		System.out.println(s1.equalsIgnoreCase("Pranathi"));// doesn't care which case the string 
		
		System.out.println(s1.getBytes());
		
		System.out.println(obj.hashCode());//returns address of the object
		
		System.out.println(s1.indexOf("h"));// returns the index of the character if not present returns -1
		
		System.out.println(s1.intern()); // returns same string 
		
		System.out.println(s4.length());
		
		System.out.println(s1.isEmpty());//if the string is empty it returns true or else false
		
		System.out.println(s1.lastIndexOf("a"));//returns the index of the character
		
		System.out.println(s1.matches("Pranathi")); //compares the strings
		
		System.out.println(s1.replace(s1,s2)); // s1 is replaced with s2
		
		System.out.println(s1.replaceAll(s1, s2)); // same as replace
		
		//JVM couldn't able to compare the string literals if there are from different memory locations(heap& SCP)
		
		if(s1==s2)  
		{
			System.out.println("Same");
		}
		else
		{
			System.out.println("Not Same");
		}
		
		System.out.println(s1==s3);
		 
		//hashCodes
		System.out.println(s6.hashCode());
		
		System.out.println(s7.hashCode());
		
		System.out.println(s8.hashCode());
		
		//escape sequences
		System.out.println("There is a book named \"The Ramayanam\" was read by seetha.");
		
		System.out.println("\b");
		
		System.out.println("\t");
		
		System.out.println("\n");
		
		System.out.println("\f");
		
		System.out.println("\r");
		
		System.out.println("\\");
		
		
	}

}

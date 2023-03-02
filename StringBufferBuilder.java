package strings;

public class StringBufferBuilder {

	public static void main(String[] args) {
		
		//StringBuffer
		
		StringBuffer sB1=new StringBuffer("abc"); //creating a object of StringBuffer class
		System.out.println("StringBuffer:");
		System.out.println();
		System.out.println(sB1);
		System.out.println(sB1.hashCode()); //The hashCode() method is used to generate the hash values of objects.
		
		//creating another Object of StringBuffer class
		StringBuffer sB2= new StringBuffer("abc");
		System.out.println(sB2);
		System.out.println(sB2.hashCode());
		System.out.println();
		
		//StringBuilder
		
		StringBuilder sb1= new StringBuilder("abc");
		System.out.println("StringBuilder:");
		System.out.println();
		System.out.println(sb1);
		System.out.println(sb1.hashCode());
		
		StringBuilder sb2= new StringBuilder("Hello");
		System.out.println(sb2);
		System.out.println(sb2);
		System.out.println(sb2.hashCode());
		
		StringBuilder sb3= new StringBuilder("abc");
		System.out.println(sb3);
		System.out.println(sb3.hashCode());
		System.out.println();
		
		/*
		      haschCodes of the same valued objects in both StringBuffer & StringBuilder are different so this makes strings as muttable.
		 */
		
		//StringBuffer & StringBuilder are identical twins but there were desinged in different times
		
		//Difference between StringBuffer and StringBuilder
		
		//StringBuffer
		
		//StringBuffer is called as Synchronized
		//version 1.0
		//StringBuffer less efficient
		
		//StringBuilder
		
		//StringBuilder is called as non-Synchronized
		//version1.5
		// more efficient
		
		//Time taken by the StringBuffer& StringBuilder to complete the below loop is:
		
		//StringBuffer
		
		long startTime=System.currentTimeMillis();
		StringBuffer sb=new StringBuffer("abc");
		for(int i=0;i<=678;i++) {
			sb.append("def");
		}System.out.println("Time Taken by StringBuffer: "+(System.currentTimeMillis()-startTime)+"ms");
		
//		//StringBuilder
//		
		startTime=System.currentTimeMillis();
		StringBuilder sb11=new StringBuilder("abc");
		for(int i=0;i<=999;i++) {
			sb11.append("def");
		}System.out.println("Time Taken by StringBuilder: "+(System.currentTimeMillis()-startTime)+"ms");
		System.out.println();
//		
		/* Time taken by StringBuffer is more when compared to StringBuilder */
		
		//Appending
		
		System.out.println("Appending:");
		System.out.println();
		StringBuilder sb4=new StringBuilder("Hello World");
		System.out.println(sb4.append(1.867));
		System.out.println(sb4.append("a"));
		System.out.println(sb4.append("def"));
		
		//appending one string to another
		StringBuilder sb5=new StringBuilder("How are you?");
		System.out.println(sb3.append(sb5));
		
		//appending StringBuilder to StringBuffer
		System.out.println(sb3.append(sB1));
	}

}

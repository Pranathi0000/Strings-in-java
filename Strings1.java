package strings;

public class Strings1 {

	public static void main(String[] args) {
		
		//declaring the string
		//static strings
		String name=new String("Pranathi"); //stored in heap
		
		//generating hashCode for name
		System.out.println(name.hashCode());
		
         String str1="abc",str2="Doc";   //stored in SCP(String Constant Pool)
         
         System.out.println(str1.hashCode());
         
         str2="You";
         
         System.out.println(str2.hashCode());
        
		//s1,s2,s3 have same memory location JVM allocates the same Valued Strings to same locations
		
		String s1="Andhra";
		String s2="Andhra";
		String s3="Andhra";
		System.out.println(s1+s2 +s3);
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		s1="kerala";
		System.out.println(s1.hashCode());
		
	}

}

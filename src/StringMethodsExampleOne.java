
public class StringMethodsExampleOne {

	public static void main(String[] args) {
		/*
		String s1=new String("Indore(M.P.)");
		String s2=new String("Indore(M.P.)");
		String s3="india";
		String s4="manoj@gmail.co.in";
		boolean b1=s1.equals(s2);
		System.out.println(b1);
		
		boolean b2=s1.equalsIgnoreCase(s2);
		System.out.println(b2);
		
		boolean b3=s3.startsWith("ind");
		System.out.println(b3);
		
		boolean b4=s4.endsWith(".com");
		System.out.println(b4);
		*/
		
		String s1="indore";
		String s2="indore";
		int n=s1.compareTo(s2);
		System.out.println(n);
		
		
		
		
		
		
		
		
	}

}
/*
 		return-type			name(parameters)
 		
 		boolean				equals(String)
 		boolean				equalsIgnoreCase(String)
 		boolean				startsWith(String)	//it checks the begining of a string
 		boolean 			endsWith(String)	//it checks the ending of a string
 		
 		int 				compareTo(String)
 		
 					int n=s1.compareTo(s2);
 					
 					if calling object is greater		+ve value
 							s1>s2		+ve
 					if calling object is smaller		-ve value
 							s1<s2		-ve
 					if both are same					0
 							s1=s2		0
 		
 					String s1="indore";
 					String s2="bhopal";
 					
 					int n=s1.compareTo(s2);
 					
 						s1		'i'		105
 						s2		'b'		98	
 					
 					
 					
 					
 		
 		
 		
 		
*/

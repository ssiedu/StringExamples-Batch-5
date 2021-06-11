
public class StringConstructorsExample {

	public static void main(String[] args) {

		String s1=new String();	//creates a string of length zero
		String s2=new String("indore");
		
		char ch[]= {'a','b','c','d','e','f','g','h','i','j','k','l'};
		String s3=new String(ch);
		String s4=new String(ch,2,5);
		
		byte b[]= {65,66,67,68,69,70,71,72,73,74,75,76,77,78,79,80};
		String s5=new String(b);
		String s6=new String(b,1,5);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);
		System.out.println(s6);
	}

}
/*
 	String()
 	String(String)
 	String(char[])
 	String(char[],int,int)
 	String(byte[])
 	String(byte[],int,int)
 
*/
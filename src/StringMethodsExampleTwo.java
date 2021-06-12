
public class StringMethodsExampleTwo {

	public static void main(String[] args) {
		
		String s="this is java";
		
		byte b[]=s.getBytes();
		
		for(byte tmp:b) {
			System.out.println(tmp);
		}
		
		/*
		char ch[]=s.toCharArray();
		for(char tmp:ch) {
			System.out.println(tmp);
		}
		*/
		
		//char ch=s.charAt(2);
		//System.out.println(ch);
		
		/*
		String s="this is java code and java is object oriented";
		//int n=s.indexOf('i',40);	//searching for 'i' and search will begin from index 3.
		int n=s.indexOf("is",3);
		System.out.println(n);
		*/
	}

}

/*
 		int indexOf(char)		//searchs  a char in invoking string.
 		int indexOf(char,int)
 		int indexOf(String)
 		int indexOf(String,int)
 		
 		char charAt(int)
 		char[] toCharArray()	//converts a string to a char array
		byte[] getBytes()		//converts a string to byte array

*/
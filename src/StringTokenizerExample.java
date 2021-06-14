import java.util.StringTokenizer;

public class StringTokenizerExample {

	public static void main(String[] args) {
		
		String s="indore,bhopal,delhi,mumbai";
		/*
		String items[]=s.split(",");
		for(String item:items) {
			System.out.println(item);
		}
		*/
		
		//we are creating tokens of the above string s.
		
		//StringTokenizer st=new StringTokenizer(s);	//using spaces
		StringTokenizer st=new StringTokenizer(s, ",");
		
		while(true) {
			boolean b=st.hasMoreTokens();
			if(b==false)break;
			System.out.println(st.nextToken());
		}
		
	}

}
/*
	String nextToken()
	boolean hasMoreTokens()		//will check if we have more tokens or not
	
*/
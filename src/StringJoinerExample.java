import java.util.StringJoiner;

public class StringJoinerExample {
public static void main(String[] args) {
	String s1="java", s2="oracle", s3="python";
	
	//you want to join s1,s2,s3 using #
	
	//StringJoiner sj=new StringJoiner("--");
	StringJoiner sj=new StringJoiner("#","[","]");
	sj.add(s1);
	sj.add(s2);
	sj.add(s3);
	
	String res=sj.toString();
	System.out.println(res);
		
}
}

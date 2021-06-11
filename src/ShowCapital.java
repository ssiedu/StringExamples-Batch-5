import java.util.Scanner;

public class ShowCapital {

	public static void main(String[] args) {
		
		//user will give name of a state and our program will display its capital
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter State : ");
		String st=sc.next();
		
		if(st.equalsIgnoreCase("MP")) {
			System.out.println("Bhopal");
		}else if(st.equalsIgnoreCase("MH")) {
			System.out.println("Mumbai");
		}else if(st.equalsIgnoreCase("RJ")) {
			System.out.println("Jaipur");
		}else {
			System.out.println("Not Available");
		}

	}

}

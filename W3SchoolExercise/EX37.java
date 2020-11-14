package W3SchoolExercise;

import java.util.Scanner;

public class EX37 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Input a String: ");
		String st=input.nextLine();
		int length=st.length();
		for(int i=st.length()-1;i>=0;i--) {
			System.out.print(st.charAt(i));
		}
	}
}

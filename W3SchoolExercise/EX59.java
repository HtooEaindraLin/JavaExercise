package W3SchoolExercise;
import java.util.Scanner;
public class EX59 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.print("Input a String: ");
		String st=input.nextLine();
		for(int i=0;i<st.length()-1;i++) {
			System.out.print(Character.toLowerCase(st.charAt(i)));
		}

	}

}

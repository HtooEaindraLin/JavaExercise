package W3SchoolExercise;
import java.util.Scanner;
public class EX62 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner (System.in);
		System.out.print("Input a word: ");
		String st=input.nextLine();
		System.out.print("The reverse word is: ");
		for (int i=st.length()-1;i>=0;i--) {
			System.out.print(st.charAt(i));
		}

	}

}

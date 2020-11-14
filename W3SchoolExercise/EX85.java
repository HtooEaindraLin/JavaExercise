package W3SchoolExercise;
import java.util.Scanner;
public class EX85 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter a string: ");
		String st=input.nextLine();
		String spec="Hello";
		System.out.print(st.startsWith(spec));
	}
}

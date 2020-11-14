package W3SchoolExercise;
import java.util.Scanner;
public class EX71 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.print("Enter first string: ");
		String st1=input.nextLine();
		System.out.print("Enter second string: ");
		String st2=input.nextLine();
		System.out.print(st1.substring(1)+st2.substring(1));

	}

}

package W3SchoolExercise;
import java.util.Scanner;
public class EX70 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.print("Enter first string: ");
		String first=input.nextLine();
		System.out.print("Enter second string: ");
		String second=input.nextLine();
		if(first.length()>second.length()) {
			System.out.print(second+first+second);
		}else System.out.print(first+second+first);
	}

}

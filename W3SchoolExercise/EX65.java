package W3SchoolExercise;
import java.util.Scanner;
public class EX65 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.print("Input first number: ");
		int first=input.nextInt();
		System.out.print("Input second number: ");
		int second=input.nextInt();
		int dividend=first/second;
		int result=first-(second* dividend);
		System.out.print("The resutl is: "+result);
	}
}

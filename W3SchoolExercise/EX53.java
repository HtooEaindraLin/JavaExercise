package W3SchoolExercise;
import java.util.Scanner;
public class EX53 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner (System.in);
		System.out.print("Input first number: ");
		int first=input.nextInt();
		System.out.print("Input second number: ");
		int second=input.nextInt();
		System.out.print("Input third number: ");
		int third=input.nextInt();
		if(second> first && third > second) {
			System.out.print("The result is: "+true);
		}else System.out.print("The result is:"+false );

	}

}

package W3SchoolExercise;
import java.util.Scanner;
public class EX52 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.print("Input the first number: ");
		int first=input.nextInt();
		System.out.print("Input the second number: ");
		int second=input.nextInt();
		System.out.print("Input the third number: ");
		int third=input.nextInt();
		int sum=first+second;
		if(sum==third) {
			System.out.print("The result is: "+true);
		}else System.out.print("The result is: "+false);

	}

}

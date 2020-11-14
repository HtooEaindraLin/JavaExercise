package W3SchoolExercise;
import java.util.Scanner;
public class EX54 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.print("Input first number: ");
		int first=input.nextInt();
		System.out.print("Input second number: ");
		int second=input.nextInt();
		System.out.print("Input third number: ");
		int third=input.nextInt();
		if((first%10==second%10) || (second%10==third%10) || (first%10==third%10)){
			System.out.print("The result value is: "+true);
		}else System.out.print("The result value is: "+false);
	}

}

package W3SchoolExercise;
import java.util.Scanner;
public class EX49 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Input a number: ");
		int number=input.nextInt();
		if(number%2==0) {
			System.out.print(1);
		}else System.out.print(0);

	}

}

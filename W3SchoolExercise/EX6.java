package W3SchoolExercise;
import java.util.Scanner;
public class EX6 {

	public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	System.out.print("Input first number: ");
	int first_number=input.nextInt();
	System.out.print("Input second number: ");
	int second_number=input.nextInt();
	System.out.println(first_number+" + "+second_number+" = "+(first_number+second_number));
	System.out.println(first_number+" - "+second_number+" = "+(first_number-second_number));
	System.out.println(first_number+" * "+second_number+" = "+(first_number*second_number));
	System.out.println(first_number+" / "+second_number+" = "+(first_number/second_number));
	System.out.println(first_number+" Mod "+second_number+" = "+(first_number % second_number));
	}
}

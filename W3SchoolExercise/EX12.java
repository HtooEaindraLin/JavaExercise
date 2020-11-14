package W3SchoolExercise;
import java.util.Scanner;
public class EX12 {
	public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	System.out.print("Enter first number: ");
	double first_number=input.nextDouble();
	System.out.print("Enter second number:" );
	double second_number=input.nextDouble();
	System.out.print("Enter third number: ");
	double third_number=input.nextDouble();
	double average=(first_number+second_number+third_number)/3;
	System.out.print("The average number is: "+average);
	}
}

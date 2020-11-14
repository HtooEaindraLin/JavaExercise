package W3SchoolExercise;
import java.util.Scanner;
public class EX26 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter octal number: ");
		int number=input.nextInt();
		System.out.print("Integer number is: "+Integer.toBinaryString(number));

	}

}

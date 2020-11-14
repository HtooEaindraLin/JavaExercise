package Chapter_2;
import java.util.Scanner;
public class EX2_7 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the number of minutes: ");
		int minutes=input.nextInt();
		int years=(minutes)/(365 * 24 * 60);
		int remaining_minutes=(minutes)%(365 * 24 *60);
		int days=remaining_minutes/(24 *60);
		System.out.println(minutes+" minutes is approximately "+years+" years and "+days+" days.");
	}
}

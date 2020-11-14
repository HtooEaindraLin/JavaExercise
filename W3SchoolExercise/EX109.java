package W3SchoolExercise;
import java.util.Scanner;
public class EX109 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.print("Enter positive number: ");
		int n=input.nextInt();
		if(n>0) {
	           System.out.println("Number of rows: "+((int)((Math.sqrt(8 * (long)n + 1) - 1) / 2)));	

		}

	}

}

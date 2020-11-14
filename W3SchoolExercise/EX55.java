package W3SchoolExercise;
import java.util.Scanner;
public class EX55 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.print("Input Seconds: ");
		int seconds=input.nextInt();
		int output_seconds=seconds%60;
		int minutes=seconds/60;
		int hour=minutes/60;
		int output_minutes=minutes%60;
		System.out.println("Hour:Minutes:Seconds "+hour+":"+output_minutes+":"+output_seconds);
	}

}

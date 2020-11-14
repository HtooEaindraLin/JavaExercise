package W3SchoolExercise;
import java.util.Scanner;
public class Ex2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.print("Please enter first vlaue: ");
		int firstvalue=input.nextInt();
		System.out.print("Please enter second value: ");
		int secondvalue=input.nextInt();
		int sum=firstvalue+secondvalue;
		System.out.print(firstvalue+" + "+secondvalue+"= "+sum);
	}
}

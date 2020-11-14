package W3SchoolExercise;
import java.util.Scanner;
public class EX7 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter number: ");
		int number=input.nextInt();
		for(int i=1;i<13;i++) {
			System.out.println(number+"*"+i+" = "+(number*i));
		}
	}

}

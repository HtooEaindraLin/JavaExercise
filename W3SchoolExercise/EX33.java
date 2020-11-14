package W3SchoolExercise;
import java.util.Scanner;
public class EX33 {
public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Input an integer: ");
		int num=input.nextInt();
		int sum=0;
		while(num>0) {
			sum+=num%10;
			num=num/10;
		}
		System.out.print("The sum of the digit is: "+sum);

	}

}

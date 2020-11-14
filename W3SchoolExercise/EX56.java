package W3SchoolExercise;
import java.util.Scanner;
public class EX56 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter range from : ");
		int x=input.nextInt();
		System.out.print("Enter range to: ");
		int y=input.nextInt();
		System.out.print("Enter divisible number: ");
		int count=0;
		int divisible=input.nextInt();
		for(int i=x;i<=y;i++) {
			if(i% divisible==0) {
				count++;
			}
		}
		System.out.print("The result is: "+count);
	}
}

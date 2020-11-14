package W3SchoolExercise;
import java.util.Scanner;
public class EX32 {
public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Input first Integer: ");
		int first=input.nextInt();
		System.out.print("Input second Integer: ");
		int  second=input.nextInt();
		if(first > second) {
			System.out.println(first+" > "+second);
		} 
		if(first < second) {
			System.out.println(first+" < "+second);
		}
		if(first == second) {
			System.out.println(first+" = "+second);
		}
		if(first <=second) {
			System.out.println(first+" <= "+second);
		}
		if(first >=second) {
			System.out.println(first+" >= "+second);
		}
		if(first !=second) {
			System.out.println(first+" != "+second);
		}
	}

}

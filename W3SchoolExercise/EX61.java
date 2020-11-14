package W3SchoolExercise;

import java.util.Scanner;
public class EX61 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.print("Input first number: ");
		int first=input.nextInt();
		System.out.print("Input second number: ");
		int second=input.nextInt();
		if(first> second) {
			System.out.print(first);
		}else System.out.print(second);
		
	}

}


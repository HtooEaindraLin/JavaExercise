package W3SchoolExercise;

import java.util.Scanner;

public class EX64 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.print("Input the first number: ");
		int first=input.nextInt();
		System.out.print("Input the second number: ");
		int second=input.nextInt();
		if(first>25 && second<75) {
			int x=first/10;
			int y=second/10;
			first=first%10;
			second=second%10;
			if(x==y || (first== second) || (x==first) || (y==second)) {
				System.out.println(true);
				}
			}else System.out.println(false);
		
	}

}

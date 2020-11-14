package W3SchoolExercise;

import java.util.Scanner;

public class EX21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int[] oct=new int[10];
		int remainder=0;
		System.out.print("Enter decimal number: ");
		int num=input.nextInt();
		System.out.print("The octal number is: ");
		String st="";
		if(num>8) {
		int i=0;
			while(num>0) {
				st=num % 8+st;
				num=num/8;				
			}
			System.out.print(st);
		}else System.out.print(num);	

	}

}

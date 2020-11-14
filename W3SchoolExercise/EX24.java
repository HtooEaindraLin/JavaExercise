package W3SchoolExercise;

import java.util.Scanner;

public class EX24 {
public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.print("Input a binary number: ");
		int num=input.nextInt();
		int sum=0;
		int count=0;
		while(num>0) {
			sum+=(num%10)*Math.pow(2,count);
			num=num/10;
			count++;			
		}
		System.out.print("Octal number is: ");
		String output="";
		if(sum>8){
			while(sum>8) {
				output=(sum%8)+output;
				sum=sum/8;
			}
			System.out.print(output);
		}else System.out.print(sum);
	}
}

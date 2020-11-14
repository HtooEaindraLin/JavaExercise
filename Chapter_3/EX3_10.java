package Chapter_3;
import java.util.Scanner;
public class EX3_10 {
	public static void main(String[] args) {
		int num1=(int) (Math.random()*100);
		int num2=(int) (Math.random()*100);
		if(num1< num2) {
		int temp=num1;
		num1=num2;
		num2=temp;
		}
		System.out.print("What is "+num1+ " - "+num2+" ? ");
		Scanner input=new Scanner(System.in);
		int answer=input.nextInt();
		if(num1-num2==answer) {
			System.out.print("You are correct.");
		}else {
			System.out.println("Your answer is wrong.");
			System.out.print(num1+" - "+num2+" should be "+(num1-num2));
		}
	}
}

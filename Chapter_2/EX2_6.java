package Chapter_2;
import java.util.Scanner;
public class EX2_6 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter a number between 0 and 1000: ");
		int num=input.nextInt();
		int sum=0;
		while(num /10!=0) {
			sum+=num % 10;
			num=num /10;
		}sum+=num%10;
		System.out.println("The sum of the digit is: "+sum);
	}
}

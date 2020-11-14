package Chapter_4;
import java.util.Scanner;
public class EX4_8 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter an ASCII code: ");
		int num=input.nextInt();
		char ch=(char) num;
		System.out.print("The character for ASCII code "+num+" is "+ch);
	}
}
